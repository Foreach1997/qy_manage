package com.qy.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy.dao.CurrencyMapper;
import com.qy.dao.ReportBookMapper;
import com.qy.dao.UserMapper;
import com.qy.entity.ReportBook;
import com.qy.entity.ReportBookExample;
import com.qy.entity.User;
import com.qy.service.ReportBookService;
import com.qy.util.ResultRespose;
import com.qy.util.SupportPage;
import com.qy.util.SystemContent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Transactional
public class ReportBookServiceImpl implements ReportBookService {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Resource
    private ReportBookMapper reportBookMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private CurrencyMapper currencyMapper;


    @Override
    public Object insertReportBook(MultipartFile file, ReportBook reportBook, HttpServletRequest request) {

        //String path = SystemContent.getFullAddressOnline(request);
        String path = SystemContent.path;
        String name = UUID.randomUUID().toString() +file.getOriginalFilename();
        reportBook.setCreateTime(new Date());
        if (!file.isEmpty()) {
            File newPath = new File(path,name);
            if (!file.isEmpty()){
                try {
                    InputStream in = file.getInputStream();
                    FileOutputStream out = new FileOutputStream(newPath);
                    byte buffer[] = new byte[1024];
                    int len = 0;
                    while ((len = in.read(buffer)) > 0) {

                        out.write(buffer, 0, len);
                    }
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return ResultRespose.rsult(200,"申请失败",null);
                }
            }
            reportBook.setUserId((int)request.getSession().getAttribute("userId"));

            reportBook.setStatus(1);
            reportBook.setReportBookFile(newPath.toString());
            reportBookMapper.insert(reportBook);
            return ResultRespose.rsult(200,"申请成功",null);
        }else {
            return ResultRespose.rsult(200,"申请失败",null);
        }
    }

    @Override
    public Object updatePro(ReportBook reportBook) {

        User u = userMapper.selectByPrimaryKey(reportBook.getUserId());

        if (u.getRoleId()==1){
            reportBook.setStatus(3);
            reportBook.setProCode(String.valueOf(System.currentTimeMillis()));
        }else if (u.getUserId()==2){
            reportBook.setStatus(2);
        }
         int val =  reportBookMapper.updateByPrimaryKeySelective(reportBook);
        if (val>0){
            return ResultRespose.rsult(200,"成功",null);
        }
        return ResultRespose.rsult(200,"失败",null);
    }

    @Override
    public Object findReportBookList(ReportBook reportBook,Integer depId,HttpServletRequest request, SupportPage supportPage) {
          User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
//        ReportBookExample reportBookExample = new ReportBookExample();
         List<Integer> list = null;
          Map<String,Object> map = new HashMap<String,Object>();
          map.put("proCode",reportBook.getProCode());
          if (u.getRoleId()==3){
              map.put("userId",u.getUserId());
          }
          if (u.getRoleId()==2){
               list =  currencyMapper.findUserIdByDepId(u.getDepId());
          }
          if (u.getRoleId() ==1){
               list =  currencyMapper.findUserIdByDepId(depId);
          }
          if (!list.isEmpty()){
              map.put("list",list);
          }
//        List<ReportBook> reportBookExampleList = null;
//        if (u.getRoleId()==3){
//            reportBookExample.createCriteria().andUserIdEqualTo((int)request.getSession().getAttribute("userId"));
//        }
//        PageHelper.startPage(supportPage.getCurrentPage(),supportPage.getPageSize());
//        reportBookExampleList = reportBookMapper.selectByExample(reportBookExample);
//        if (u.getRoleId()==2){
//            List<Integer> list =  currencyMapper.findUserIdByDepId(u.getDepId());
//            reportBookExampleList =  currencyMapper.findReportBookList(list);
//        }
        if (supportPage.getCurrentPage()!=null&&supportPage.getPageSize()!=null) {
            map.put("currentPage", (supportPage.getCurrentPage() - 1) * supportPage.getPageSize());
            map.put("pageSize", supportPage.getPageSize());
        }
        List<ReportBook> reportBookExampleList =  currencyMapper.findReportBookList(map);
        int count = currencyMapper.findReportBookListCount(map);
        List<JSONObject> res = new ArrayList<JSONObject>();
        for (ReportBook r:reportBookExampleList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("reportBookId",r.getReportBookId());
            jsonObject.put("proCode",r.getProCode());
            jsonObject.put("createTime",format.format(r.getCreateTime()));
            jsonObject.put("proBackground",r.getProBackground());
            jsonObject.put("proBenefit",r.getProBenefit());
            jsonObject.put("proDescribe",r.getProDescribe());
            jsonObject.put("proFeasibility",r.getProFeasibility());
            jsonObject.put("proMoney",r.getProMoney());
            jsonObject.put("proSource",r.getProSource());
            jsonObject.put("proRisk",r.getProRisk());
            jsonObject.put("status",r.getStatus());
            jsonObject.put("reportBookFile",r.getReportBookFile());
            jsonObject.put("roleId",u.getRoleId());
            res.add(jsonObject);
        }
        return ResultRespose.rsultRespose(200,"请求成功",res,count);
    }
}

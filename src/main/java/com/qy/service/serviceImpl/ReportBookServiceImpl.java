package com.qy.service.serviceImpl;

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
import java.util.List;
import java.util.UUID;

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

        String path = SystemContent.getFullAddressOnline(request);
        String name = UUID.randomUUID().toString() +file.getOriginalFilename();

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
    public Object findReportBookList(ReportBook reportBook, HttpServletRequest request, SupportPage supportPage) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
        ReportBookExample reportBookExample = new ReportBookExample();
        List<ReportBook> reportBookExampleList = null;
        if (u.getRoleId()==3){
            reportBookExample.createCriteria().andUserIdEqualTo((int)request.getSession().getAttribute("userId"));
        }
        PageHelper.startPage(supportPage.getCurrentPage(),supportPage.getPageSize());
        reportBookExampleList = reportBookMapper.selectByExample(reportBookExample);
        if (u.getRoleId()==2){
            List<Integer> list =  currencyMapper.findUserIdByDepId(u.getDepId());
            reportBookExampleList =  currencyMapper.findReportBookList(list);
        }
        PageInfo pageInfo = new PageInfo(reportBookExampleList);
        for (ReportBook r:reportBookExampleList){
            try {
                r.setCreateTime(format.parse(format.format(new Timestamp(r.getCreateTime().getTime()))));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return ResultRespose.rsultRespose(200,"请求成功",reportBookExampleList,pageInfo.getTotal());
    }
}

package com.qy.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qy.dao.*;
import com.qy.entity.*;
import com.qy.service.DepartmentService;
import com.qy.service.TaskBookService;
import com.qy.util.ResultRespose;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Transactional
public class TaskBookServiceImpl implements TaskBookService {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



    @Resource
    private WorkStaffMapper workStaffMapper;
    @Resource
    private CurrencyMapper currencyMapper;
   @Resource
    private DepartmentMapper departmentMapper;
   @Resource
    private UserMapper userMapper;
    @Resource
    private ProMakeMapper proMakeMapper;

    @Override
    public Object insertWorkStaff(WorkStaff workStaff, HttpServletRequest request) {
        workStaff.setCreateTiem(new Date());
        workStaff.setStatus(1);
        workStaff.setWorkLeadId((int)request.getSession().getAttribute("userId"));
        workStaffMapper.insert(workStaff);
        return ResultRespose.rsult(200,"添加成功",null);
    }

    @Override
    public Object findWorkTaskList(WorkStaff workStaff,HttpServletRequest request, SupportPage supportPage) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId",workStaff.getUserId());
        map.put("proCode",workStaff.getProCode());
        map.put("workLeadId",workStaff.getWorkLeadId());

        if (supportPage.getCurrentPage()!=null&&supportPage.getPageSize()!=null) {
            map.put("currentPage", (supportPage.getCurrentPage() - 1) * supportPage.getPageSize());
            map.put("pageSize", supportPage.getPageSize());
        }
        List<JSONObject> workStaffs = currencyMapper.findWorkStaffList(map);
        int count = currencyMapper.findWorkStaffListCount(map);
        for (JSONObject jsonObject:workStaffs){
            jsonObject.put("createTiem",format.format(jsonObject.getDate("createTiem")));
            jsonObject.put("depName",departmentMapper.selectByPrimaryKey(jsonObject.getInteger("depId")).getDepName());
            jsonObject.put("userName",userMapper.selectByPrimaryKey(jsonObject.getInteger("userId")).getUserName());
        }
        return ResultRespose.rsultRespose(200,"请求成功",workStaffs,count);
    }

    @Override
    public Object findProgress(TaskBook taskBook, Integer depId, HttpServletRequest request, SupportPage supportPage) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));

        List<Integer> list = null;
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("reportCode",taskBook.getReportCode());
        if (u.getRoleId()==3){
            map.put("userId",u.getUserId());
        }
        if (u.getRoleId()==2){
            list =  currencyMapper.findUserIdByDepId(u.getDepId());
        }
        if (u.getRoleId() ==1&& depId!=null){
            list =  currencyMapper.findUserIdByDepId(depId);
        }
        if ( list!=null){
            map.put("list",list);
        }

        if (supportPage.getCurrentPage()!=null&&supportPage.getPageSize()!=null) {
            map.put("currentPage", (supportPage.getCurrentPage() - 1) * supportPage.getPageSize());
            map.put("pageSize", supportPage.getPageSize());
        }
        List<JSONObject> taskBookExampleList =  currencyMapper.findTaskBookList(map);
        int count = currencyMapper.findTaskBookListCount(map);
        List<JSONObject> res = new ArrayList<JSONObject>();
        ProMakeExample proMakeExample = new ProMakeExample();
        for (JSONObject jsonObject : taskBookExampleList){
            proMakeExample.createCriteria().andUserIdEqualTo(jsonObject.getInteger("userId"))
            .andProCodeEqualTo(jsonObject.getString("proCode")).andMakeTypeEqualTo(1);
            long A = proMakeMapper.countByExample(proMakeExample);
            proMakeExample.createCriteria().andUserIdEqualTo(jsonObject.getInteger("userId"))
                    .andProCodeEqualTo(jsonObject.getString("proCode")).andMakeTypeEqualTo(2);
            long B = proMakeMapper.countByExample(proMakeExample);
            proMakeExample.createCriteria().andUserIdEqualTo(jsonObject.getInteger("userId"))
                    .andProCodeEqualTo(jsonObject.getString("proCode")).andMakeTypeEqualTo(3);
            long C = proMakeMapper.countByExample(proMakeExample);
            jsonObject.put("createTime",format.format(jsonObject.getDate("createTime")));
            jsonObject.put("proTimeStart",format.format(jsonObject.getDate("proTimeStart")));
            jsonObject.put("proTimeEnd",format.format(jsonObject.getDate("proTimeEnd")));
            jsonObject.put("A",A);
            jsonObject.put("B",B);
            jsonObject.put("C",C);
            float s= Float.valueOf(A)/5*100;
            jsonObject.put("S",s+"%");
            jsonObject.put("roleId",u.getRoleId());
            res.add(jsonObject);
        }
        return ResultRespose.rsultRespose(200,"请求成功",res,count);
    }
}

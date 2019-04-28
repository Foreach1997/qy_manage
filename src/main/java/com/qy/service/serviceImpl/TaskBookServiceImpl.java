package com.qy.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy.dao.*;
import com.qy.entity.*;
import com.qy.service.DepartmentService;
import com.qy.service.TaskBookService;
import com.qy.util.ResultRespose;
import com.qy.util.SupportPage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
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
    @Resource
    private TaskBookMapper taskBookMapper;
    @Resource
    private ProChangeMapper proChangeMapper;
    @Resource
    private ProStopMapper proStopMapper;
    @Resource
    private ProFinishMapper proFinishMapper;

    @Override
    public Object insertOrUpdateWorkStaff(WorkStaff workStaff,String isUpdate, HttpServletRequest request) {
        TaskBook taskBook = new TaskBook();
        taskBook.setStatus(13);
        TaskBookExample taskBookExample = new TaskBookExample();
        taskBookExample.createCriteria().andReportCodeEqualTo(workStaff.getProCode());
        taskBookMapper.updateByExampleSelective(taskBook,taskBookExample);

        if ("no".equals(isUpdate)) {
            workStaff.setCreateTiem(new Date());
            workStaff.setStatus(1);
            workStaff.setWorkLeadId((int) request.getSession().getAttribute("userId"));
            workStaffMapper.insert(workStaff);
            return ResultRespose.rsult(200, "添加成功", null);
        }else {
            WorkStaffExample workStaffExample = new WorkStaffExample();
            workStaffExample.createCriteria().andWorkStaffIdEqualTo(workStaff.getWorkStaffId());
            workStaffMapper.updateByExample(workStaff,workStaffExample);
            return ResultRespose.rsult(200, "修改成功", null);
        }
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
        for (JSONObject jsonObject : taskBookExampleList){
            ProMakeExample proMakeExampleA = new ProMakeExample();
            proMakeExampleA.createCriteria().andUserIdEqualTo(jsonObject.getInteger("userId"))
            .andProCodeEqualTo(jsonObject.getString("reportCode")).andMakeTypeEqualTo(1);
            long A = proMakeMapper.countByExample(proMakeExampleA);
            ProMakeExample proMakeExampleB = new ProMakeExample();
            proMakeExampleB.createCriteria().andUserIdEqualTo(jsonObject.getInteger("userId"))
                    .andProCodeEqualTo(jsonObject.getString("reportCode")).andMakeTypeEqualTo(2);
            long B = proMakeMapper.countByExample(proMakeExampleB);
            ProMakeExample proMakeExampleC = new ProMakeExample();
            proMakeExampleC.createCriteria().andUserIdEqualTo(jsonObject.getInteger("userId"))
                    .andProCodeEqualTo(jsonObject.getString("reportCode")).andMakeTypeEqualTo(3);
            long C = proMakeMapper.countByExample(proMakeExampleC);
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

    @Override
    public Object reportTask(WorkStaff workStaff, HttpServletRequest request) {
        TaskBookExample taskBookExample = new TaskBookExample();
        taskBookExample.createCriteria().andReportCodeEqualTo(workStaff.getProCode());
        TaskBook taskBook =  taskBookMapper.selectByExample(taskBookExample).get(0);

        if (taskBook.getStatus()==6 || taskBook.getStatus()==7 || taskBook.getStatus()==10){
            return ResultRespose.rsult(200,"该项目不能进行汇报",null);
        }

        WorkStaffExample workStaffExample = new WorkStaffExample();
        workStaffExample.createCriteria().andWorkStaffIdEqualTo(workStaff.getWorkStaffId());
        workStaffMapper.updateByExampleSelective(workStaff,workStaffExample);
        return ResultRespose.rsult(200,"修改成功",null);
    }

    @Override
    public int taskStatus(String proCode){
        TaskBookExample taskBookExample = new TaskBookExample();
        taskBookExample.createCriteria().andReportCodeEqualTo(proCode);
        List<TaskBook> pro = taskBookMapper.selectByExample(taskBookExample);
        return  pro.get(0).getStatus();
    }

    @Override
    public Object proSpeedManage(TaskBook tBook,Integer depId ,HttpServletRequest request, SupportPage supportPage) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));

        List<Integer> list = null;
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("reportCode",tBook.getReportCode());
        map.put("status",13);
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
        for (JSONObject taskBook : taskBookExampleList){
            Date date = taskBook.getDate("proTimeEnd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            LocalDate localDate =  LocalDate.of(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH));
            Period resDay = Period.between(localDate,LocalDate.now());
            int  day = resDay.getDays();
            if (day > 5){
                //FIXME warn 插入警告
                taskBook.put("color",3);
            }else if (day < 5){
                taskBook.put("color",2);
            }else if (day <= 0){
                taskBook.put("color",1);
            }
            taskBook.put("createTime",format.format(taskBook.getDate("createTime")));
            taskBook.put("proTimeStart",format.format(taskBook.getDate("proTimeStart")));
            taskBook.put("proTimeEnd",format.format(taskBook.getDate("proTimeEnd")));
        }
        return ResultRespose.rsultRespose(200,"请求成功",taskBookExampleList,count);
    }

    @Override
    public Object proFeeManage(TaskBook tBook,Integer depId,HttpServletRequest request, SupportPage supportPage) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));

        List<Integer> list = null;
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("reportCode",tBook.getReportCode());
        map.put("status",13);
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
        for (JSONObject taskBook : taskBookExampleList) {
            Float money = taskBook.getFloat("proMoney");
            Float realMoney = currencyMapper.sumPlanMoney(taskBook.getString("reportCode"));
            if (realMoney == null){
                realMoney = 0.0f;
            }
            if (money >= realMoney) {
                taskBook.put("color", 1);
            } else if (money < realMoney && realMoney - money < money * 0.1) {
                taskBook.put("color", 2);
            } else if (money < realMoney && realMoney - money > money * 0.1) {
                taskBook.put("color", 3);
            }
            taskBook.put("createTime", format.format(taskBook.getDate("createTime")));
        }
        return ResultRespose.rsultRespose(200,"请求成功",taskBookExampleList,count);
    }

    @Override
    public Object proStatusCause(TaskBook taskBook) {
        //项目中止
        if (taskBook.getStatus() == 5 || taskBook.getStatus() == 6){
            ProStop proStop = new ProStop();
            proStop.setProCode(taskBook.getReportCode());
            proStop =  proStopMapper.findProStop(proStop);
            return ResultRespose.rsult(200,"请求成功",proStop);
        }else if (taskBook.getStatus() == 9 || taskBook.getStatus() == 10){
            ProFinish proFinish = new ProFinish();
            proFinish.setProCode(taskBook.getReportCode());
            proFinish = proFinishMapper.findProFinish(proFinish);
            return ResultRespose.rsult(200,"请求成功",proFinish);
        }else if (taskBook.getStatus() == 11 || taskBook.getStatus() == 12){
            ProChange proChange = new ProChange();
            proChange.setProCode(taskBook.getReportCode());
            proChange =  proChangeMapper.findProChange(proChange);
            return ResultRespose.rsult(200,"请求成功",proChange);
        }
        return null;
    }

    @Override
    public void insertProStatus(Integer status,ProFinish proFinish, ProChange proChange, ProStop proStop,HttpServletRequest request) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
        if (u.getRoleId()==3) {
            if (status == 4) {
                proStop.setUserId(u.getUserId());
                proStop.setCreateTime(new Date());
                proStopMapper.insert(proStop);
            } else if (status == 8) {
                proFinish.setUserId(u.getUserId());
                proFinish.setCreateTime(new Date());
                proFinishMapper.insert(proFinish);
            } else if (status == 11) {
                proChange.setUserId(u.getUserId());
                proChange.setCreateTime(new Date());
                proChangeMapper.insert(proChange);
            }
        }
    }


}

package com.qy.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy.dao.*;
import com.qy.entity.*;
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
    @Resource
    private PlanBookMapper planBookMapper;
    @Resource
    private TaskBookMapper taskBookMapper;
    @Resource
    private WorkMapper workMapper;
    @Resource
    private WorkStaffMapper workStaffMapper;
    @Resource
    private ProFinishMapper proFinishMapper;
    @Resource
    private ProStopMapper proStopMapper;
    @Resource
    private ProChangeMapper proChangeMapper;

    @Override
    public Object insertReportBook(MultipartFile file, ReportBook reportBook, HttpServletRequest request,String isUpdate) {

        if ("yes".equals(isUpdate)){
            reportBookMapper.deleteByPrimaryKey(reportBook.getReportBookId());
        }
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

//        User u = userMapper.selectByPrimaryKey(reportBook.getUserId());
//
//        if (u.getRoleId()==1){
//            reportBook.setStatus(3);
//            reportBook.setProCode(String.valueOf(System.currentTimeMillis()));
//        }else if (u.getUserId()==2){
//            reportBook.setStatus(2);
//        }
         if (reportBook.getStatus()==3){
             reportBook.setProCode(String.valueOf(System.currentTimeMillis()));
             //FIXME 插入项目经理表信息
             Work work = new Work();
             work.setCreateTime(new Date());
             work.setWorkRoleName("项目经理");
             work.setProCode(reportBook.getProCode());
             //work.setStatus();
             work.setUserId(reportBook.getUserId());
             workMapper.insert(work);
         }
         int val =  reportBookMapper.updateByPrimaryKeySelective(reportBook);
        if (val!=0){
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
          if (u.getRoleId() ==1 && depId!=null){
               list =  currencyMapper.findUserIdByDepId(depId);
          }
          if ( list!=null){
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

    @Override
    public Object findPlanBookList(PlanBook planBook,Integer depId,HttpServletRequest request, SupportPage supportPage) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));

        List<Integer> list = null;
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("reportCode",planBook.getReportCode());
        if (u.getRoleId()==3){
            map.put("userId",u.getUserId());
        }
        if (u.getRoleId()==2){
            list =  currencyMapper.findUserIdByDepId(u.getDepId());
        }
        if (u.getRoleId() ==1&& depId!=null){
            list =  currencyMapper.findUserIdByDepId(depId);
        }
        if (list!=null){
            map.put("list",list);
        }

        if (supportPage.getCurrentPage()!=null&&supportPage.getPageSize()!=null) {
            map.put("currentPage", (supportPage.getCurrentPage() - 1) * supportPage.getPageSize());
            map.put("pageSize", supportPage.getPageSize());
        }
        List<JSONObject> planBookExampleList =  currencyMapper.findPlanBookList(map);
        int count = currencyMapper.findPlanBookListCount(map);
        List<JSONObject> res = new ArrayList<JSONObject>();
        for (JSONObject jsonObject : planBookExampleList){
            jsonObject.put("createTime",format.format(jsonObject.getDate("createTime")));
            jsonObject.put("roleId",u.getRoleId());
            res.add(jsonObject);
        }
        return ResultRespose.rsultRespose(200,"请求成功",res,count);
    }

    @Override
    public Object insertPlanBook(MultipartFile file, PlanBook planBook, HttpServletRequest request,String isUpdate) {

        if ("yes".equals(isUpdate)) {
            planBookMapper.deleteByPrimaryKey(planBook.getPlanBookId());
        }
        PlanBookExample planBookExample = new PlanBookExample();
        planBookExample.createCriteria().andReportCodeEqualTo(planBook.getReportCode());
        long count = planBookMapper.countByExample(planBookExample);
        if (count>0){
            return ResultRespose.rsult(200,"该项目已有计划书",null);
        }
        String path = SystemContent.path;
        String name = UUID.randomUUID().toString() +file.getOriginalFilename();
        planBook.setCreateTime(new Date());
        if (!file.isEmpty()) {
            File newPath = new File(path,name);
            InputStream in = null;
            FileOutputStream out = null;
            try {
                in = file.getInputStream();
                out = new FileOutputStream(newPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (!file.isEmpty()){
                try {
                    byte buffer[] = new byte[2048];
                    int len;
                    while ((len = in.read()) != -1) {
                        out.write(len);
                        //out.write(buffer, 0, len);
                    }
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return ResultRespose.rsult(200,"申请失败",null);
                }finally {
                    try {
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            planBook.setUserId((int)request.getSession().getAttribute("userId"));

            planBook.setStatus(1);
            planBook.setGanttChart(newPath.toString());
            planBookMapper.insert(planBook);
            return ResultRespose.rsult(200,"申请成功",null);
        }else {
            return ResultRespose.rsult(200,"申请失败",null);
        }
    }

    @Override
    public Object updatePlan(PlanBook planBook) {

        int val =  planBookMapper.updateByPrimaryKeySelective(planBook);
        if (val!=0){
            return ResultRespose.rsult(200,"成功",null);
        }
        return ResultRespose.rsult(200,"失败",null);
    }

    @Override
    public Object findTaskBookList(TaskBook taskBook, Integer depId, HttpServletRequest request, SupportPage supportPage) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));

        List<Integer> list = null;
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("reportCode",taskBook.getReportCode());
        map.put("proName",taskBook.getProName());
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
            jsonObject.put("createTime",format.format(jsonObject.getDate("createTime")));
            jsonObject.put("proTimeStart",format.format(jsonObject.getDate("proTimeStart")));
            jsonObject.put("proTimeEnd",format.format(jsonObject.getDate("proTimeEnd")));
            jsonObject.put("roleId",u.getRoleId());
            res.add(jsonObject);
        }
        return ResultRespose.rsultRespose(200,"请求成功",res,count);

    }

    @Override
    public Object insertTaskBook(MultipartFile file,TaskBook taskBook,String start,String end,String isUpdate,HttpServletRequest request) {
        String path = SystemContent.path;
        String name = UUID.randomUUID().toString() + file.getOriginalFilename();
        if (!file.isEmpty()) {
            File newPath = new File(path, name);
            InputStream in = null;
            FileOutputStream out = null;
            try {
                in = file.getInputStream();
                out = new FileOutputStream(newPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (!file.isEmpty()) {
                try {
                    byte buffer[] = new byte[2048];
                    int len;
                    while ((len = in.read()) != -1) {
                        out.write(len);
                        //out.write(buffer, 0, len);
                    }
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return ResultRespose.rsult(200, "申请失败", null);
                } finally {
                    try {
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("no".equals(isUpdate)) {
                TaskBookExample taskBookExample = new TaskBookExample();
                taskBookExample.createCriteria().andReportCodeEqualTo(taskBook.getReportCode());
                long count = taskBookMapper.countByExample(taskBookExample);
                if (count > 0) {
                    return ResultRespose.rsult(200, "该项目已有任务书", null);
                }
                taskBook.setCreateTime(new Date());
                taskBook.setUserId((int) request.getSession().getAttribute("userId"));
                taskBook.setTaskFile(newPath.toString());
                try {
                    taskBook.setProTimeEnd(format.parse(end + " 00:00:00"));
                    taskBook.setProTimeStart(format.parse(start + " 00:00:00"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                taskBook.setStatus(1);
                WorkExample workExample = new WorkExample();
                workExample.createCriteria().andProCodeEqualTo(taskBook.getReportCode());
                taskBook.setWorkId(workMapper.selectByExample(workExample).get(0).getWorkId());
                int val = taskBookMapper.insert(taskBook);
                if (val != 0) {
                    return ResultRespose.rsult(200, "成功", null);
                }
                return ResultRespose.rsult(200, "失败", null);
            } else if ("yes".equals(isUpdate)) {
                TaskBookExample taskBookExample = new TaskBookExample();
                taskBookExample.createCriteria().andReportCodeEqualTo(taskBook.getReportCode());
                taskBook.setCreateTime(new Date());
                taskBook.setUserId((int) request.getSession().getAttribute("userId"));
                taskBook.setTaskFile(newPath.toString());
                try {
                    taskBook.setProTimeEnd(format.parse(end + " 00:00:00"));
                    taskBook.setProTimeStart(format.parse(start + " 00:00:00"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                taskBook.setStatus(1);
                int val = taskBookMapper.updateByExampleSelective(taskBook, taskBookExample);
                if (val != 0) {
                    WorkStaffExample workStaffExample = new WorkStaffExample();
                    workStaffExample.createCriteria().andProCodeEqualTo(taskBook.getReportCode());
                    WorkStaff workStaff = new WorkStaff();
                    workStaff.setStatus(3);
                    workStaffMapper.updateByExampleSelective(workStaff, workStaffExample);

                    return ResultRespose.rsult(200, "成功", null);
                }
                return ResultRespose.rsult(200, "失败", null);
            }
            return ResultRespose.rsult(200, "失败", null);
        }
        return ResultRespose.rsult(200, "失败", null);
    }
    @Override
    public Object updateTask(TaskBook taskBook,String code) {
        WorkExample workExample = new WorkExample();
        workExample.createCriteria().andProCodeEqualTo(taskBook.getReportCode());
        List<Work> works = workMapper.selectByExample(workExample);
        taskBook.setWorkId(works.get(0).getWorkId());

        WorkStaffExample workStaffExample = new WorkStaffExample();
        workStaffExample.createCriteria().andProCodeEqualTo(taskBook.getReportCode());
        WorkStaff workStaff = new WorkStaff();
        //FIXME 在此处对各种状态进行判断和处理
        if (taskBook.getStatus()==6) {
            workStaff.setStatus(4);
            workStaffMapper.updateByExampleSelective(workStaff,workStaffExample);
        }else if (taskBook.getStatus()==7){
            workStaff.setStatus(3);
            workStaffMapper.updateByExampleSelective(workStaff,workStaffExample);
        }else if (taskBook.getStatus()==10){
            workStaff.setStatus(2);
            workStaffMapper.updateByExampleSelective (workStaff,workStaffExample);
        }else if (taskBook.getStatus()==13){
            if ("finish".equals(code)){
                ProFinish proFinish = new ProFinish();
                proFinish.setProCode(taskBook.getReportCode());
                proFinishMapper.delete(proFinish);
            }else if ("stop".equals(code)){
                ProStop proStop = new ProStop();
                proStop.setProCode(taskBook.getReportCode());
                proStopMapper.delete(proStop);
            }else if ("change".equals(code)){
                ProChange proChange = new ProChange();
                proChange.setProCode(taskBook.getReportCode());
                proChangeMapper.delete(proChange);
            }
            workStaff.setStatus(1);
            workStaffMapper.updateByExampleSelective (workStaff,workStaffExample);
        }
        int val = taskBookMapper.updateByPrimaryKeySelective(taskBook);
        if (val!=0){
            return ResultRespose.rsult(200,"成功",null);
        }
        return ResultRespose.rsult(200,"失败",null);
    }

    @Override
    public Object findUserProCode(HttpServletRequest request) {
        ReportBookExample reportBookExample = new ReportBookExample();
        reportBookExample.createCriteria().andStatusEqualTo(3).andUserIdEqualTo((int)request.getSession().getAttribute("userId"));
        List<ReportBook> reportBooks = reportBookMapper.selectByExample(reportBookExample);
        return ResultRespose.rsult(200,"成功",reportBooks);
    }

    @Override
    public Object delTaskStaff(WorkStaff workStaff) {
        workStaffMapper.deleteByPrimaryKey(workStaff.getWorkStaffId());
        return ResultRespose.rsult(200,"成功",null);
    }


}

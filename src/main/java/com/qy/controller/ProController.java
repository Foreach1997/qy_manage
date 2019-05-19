package com.qy.controller;

import com.qy.dao.ProMakeMapper;
import com.qy.entity.*;
import com.qy.service.ProMakeService;
import com.qy.service.TaskBookService;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/pro")
public class ProController {

    @Resource
    private TaskBookService taskBookService;
    @Resource
    private ProMakeService proMakeService;
    /**
     * 项目人员分配
     */
    @ResponseBody
    @RequestMapping("/insertOrUpdateWorkStaff")
    public Object insertWorkStaff(WorkStaff workStaff,String end,String start,String isUpdate, HttpServletRequest request){
        return taskBookService.insertOrUpdateWorkStaff(workStaff,end,start,isUpdate,request);
    }

    /**
     * 查看我的任务
     */
    @ResponseBody
    @RequestMapping("/findWorkTaskList")
    public Object findWorkTaskList(WorkStaff workStaff, HttpServletRequest request, SupportPage supportPage){
        return taskBookService.findWorkTaskList(workStaff,request,supportPage);
    }


    /**
     * 任务超时提醒
     */
    @ResponseBody
    @RequestMapping("/workWarn")
    public Object workWarn(HttpServletRequest request , HttpServletResponse response){
        return taskBookService.workWarn(request,response);
    }



    /**
     * 项目汇报
     */
    @ResponseBody
    @RequestMapping("/reportTask")
    public Object reportTask(WorkStaff workStaff, HttpServletRequest request){
        return taskBookService.reportTask(workStaff,request);
    }

    /**
     * 查看项目进行时提交的文件
     */
    @ResponseBody
    @RequestMapping("/findProgress")
    public Object findProgress(TaskBook taskBook, Integer depId, HttpServletRequest request, SupportPage supportPage){
        return taskBookService.findProgress(taskBook,depId,request,supportPage);
    }

    /**
     * 查看项目进行时提交的文件
     */
    @ResponseBody
    @RequestMapping("/insertProMake")
    public Object insertProMake(MultipartFile file, ProMake proMake, HttpServletRequest request){
        return proMakeService.insertProMake(file,proMake,request);
    }


    /**
     * 查看项目进度
     */
    @ResponseBody
    @RequestMapping("/proSpeedManage")
    public Object proSpeedManage(TaskBook tBook,Integer depId ,HttpServletRequest request, SupportPage supportPage){
        return taskBookService.proSpeedManage(tBook,depId,request,supportPage);
    }

    /**
     * 查看项目费用
     */
    @ResponseBody
    @RequestMapping("/proFeeManage")
    public Object proFeeManage(TaskBook tBook,Integer depId ,HttpServletRequest request, SupportPage supportPage){
        return taskBookService.proFeeManage(tBook,depId,request,supportPage);
    }

    /**
     * 查看项目状态原因
     */
    @ResponseBody
    @RequestMapping("/proStatusCause")
    public Object proFeeManage(TaskBook taskBook){
        return taskBookService.proStatusCause(taskBook);
    }

    /**
     * 按照不同的状态添加申请原因
     */
    @ResponseBody
    @RequestMapping("/insertProStatus")
    public void insertProStatus(Integer status,ProFinish proFinish, ProChange proChange,ProStop proStop,HttpServletRequest request){
         taskBookService.insertProStatus(status,proFinish,proChange,proStop,request);
    }


    /**
     * 查看汇报内容
     */
    @ResponseBody
    @RequestMapping("/findReportNote")
    public Object findReportNote(WorkStaff workStaff){
       return taskBookService.findReportNote(workStaff);
    }


    /**
     * 评阅
     */
    @ResponseBody
    @RequestMapping("/workReview")
    public Object workReview(WorkStaff workStaff){
         return  taskBookService.workReview(workStaff);
    }

    /**
     *
     */
    @ResponseBody
    @RequestMapping("/workStaffStatus")
    public Object workStaffStatus(WorkStaff workStaff){
        return  taskBookService.workStaffStatus(workStaff);
    }

    /**
     * 项目进展文件下载
     */
    @ResponseBody
    @RequestMapping("/downProMake")
    public void downProMake(String proCode, String per, HttpServletResponse response){

          taskBookService.downMakeFile(proCode,per,response);
    }


    /**
     * 提交文件下载
     */
    @ResponseBody
    @RequestMapping("/downPlanOrReport")
    public void downPlanOrReport(String proCode,Integer reportBookId,String per,HttpServletResponse response){
        taskBookService.downPlanOrReport(proCode,reportBookId,per,response);
    }







    /**
     *
     */
//    @ResponseBody
//    @RequestMapping(value = "/insertWorkStaff")
//    public Object insertWorkStaff(WorkStaff workStaff, HttpServletRequest request){
//        return taskBookService.insertWorkStaff(workStaff,request);
//    }

}

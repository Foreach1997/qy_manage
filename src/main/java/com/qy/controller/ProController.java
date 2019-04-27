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
    public Object insertWorkStaff(WorkStaff workStaff,String isUpdate, HttpServletRequest request){
        return taskBookService.insertOrUpdateWorkStaff(workStaff,isUpdate,request);
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
    public void insertProStatus(Integer status,ProFinish proFinish, ProChange proChange,ProStop proStop){
         taskBookService.insertProStatus(status,proFinish,proChange,proStop);
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

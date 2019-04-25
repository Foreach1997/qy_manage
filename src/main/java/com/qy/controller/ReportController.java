package com.qy.controller;


import com.qy.entity.PlanBook;
import com.qy.entity.ReportBook;
import com.qy.entity.TaskBook;
import com.qy.service.ReportBookService;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Resource
    private ReportBookService reportBookService;

    @ResponseBody
    @RequestMapping("/reportList")
    public Object reportList(ReportBook reportBook,Integer depId, HttpServletRequest request, SupportPage supportPage){

        return reportBookService.findReportBookList(reportBook,depId,request,supportPage);
    }
    /**
     * 申请项目(立项阶段)
     */
    @ResponseBody
    @RequestMapping("/insertReportBook")
    public Object insertReportBook(MultipartFile file, ReportBook reportBook, HttpServletRequest request){
        return  reportBookService.insertReportBook(file,reportBook,request);
    }
    /**
     * 项目状态(立项阶段)
     */
    @ResponseBody
    @RequestMapping("/updatePro")
    public Object updatePro(ReportBook reportBook){
        return  reportBookService.updatePro(reportBook);
    }

    @ResponseBody
    @RequestMapping("/planList")
    public Object planList(PlanBook planBook,Integer depId, HttpServletRequest request, SupportPage supportPage){

        return reportBookService.findPlanBookList(planBook,depId,request,supportPage);
    }
    /**
     * 申请计划(计划阶段)
     */
    @ResponseBody
    @RequestMapping("/insertPlanBook")
    public Object insertPlanBook(MultipartFile file, PlanBook planBook, HttpServletRequest request){
        return  reportBookService.insertPlanBook(file,planBook,request);
    }
    /**
     * 计划状态(计划阶段)
     */
    @ResponseBody
    @RequestMapping("/updatePlan")
    public Object updatePlan( PlanBook planBook){
        return  reportBookService.updatePlan(planBook);
    }

    @ResponseBody
    @RequestMapping("/taskList")
    public Object taskList(TaskBook taskBook, Integer depId, HttpServletRequest request, SupportPage supportPage){

        return reportBookService.findTaskBookList(taskBook,depId,request,supportPage);
    }
    /**
     * 申请任务(任务阶段)
     */
    @ResponseBody
    @RequestMapping("/insertTaskBook")
    public Object insertTaskBook(TaskBook taskBook,String start,String end ,String isUpdate, HttpServletRequest request){
        return  reportBookService.insertTaskBook(taskBook,start,end,isUpdate,request);
    }
    /**
     * 任务状态(阶段)
     */
    @ResponseBody
    @RequestMapping("/updateTask")
    public Object updateTask(TaskBook taskBook){
        return  reportBookService.updateTask(taskBook);
    }

    /**
     * 获取所有的项目编码
     */
    @ResponseBody
    @RequestMapping("/findAllProCode")
    public Object findAllProCode(){
        return reportBookService.findAllProCode();
    }
}

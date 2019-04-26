package com.qy.controller;

import com.qy.dao.ProMakeMapper;
import com.qy.entity.ProMake;
import com.qy.entity.TaskBook;
import com.qy.entity.WorkStaff;
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
     *
     */
//    @ResponseBody
//    @RequestMapping(value = "/insertWorkStaff")
//    public Object insertWorkStaff(WorkStaff workStaff, HttpServletRequest request){
//        return taskBookService.insertWorkStaff(workStaff,request);
//    }

}

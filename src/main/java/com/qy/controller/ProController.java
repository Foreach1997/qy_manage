package com.qy.controller;

import com.qy.entity.WorkStaff;
import com.qy.service.TaskBookService;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/pro")
public class ProController {

    @Resource
    private TaskBookService taskBookService;
    /**
     * 项目人员分配
     */
    @ResponseBody
    @RequestMapping("/insertWorkStaff")
    public Object insertWorkStaff(WorkStaff workStaff, HttpServletRequest request){
        return taskBookService.insertWorkStaff(workStaff,request);
    }

    /**
     * 查看我的任务
     */
    @ResponseBody
    @RequestMapping("/findWorkTaskList")
    public Object findWorkTaskList(WorkStaff workStaff, HttpServletRequest request, SupportPage supportPage){
        return taskBookService.findWorkTaskList(workStaff,request,supportPage);
    }

}

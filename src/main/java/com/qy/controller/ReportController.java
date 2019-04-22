package com.qy.controller;


import com.qy.entity.ReportBook;
import com.qy.service.ReportBookService;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Resource
    private ReportBookService reportBookService;
    /**
     * 申请项目(立项阶段)
     */
    public Object insertReportBook(){

        return  null;

    }

    @ResponseBody
    @RequestMapping("/reportList")
    public Object reportList(ReportBook reportBook, HttpServletRequest request, SupportPage supportPage){

        return reportBookService.findReportBookList(reportBook,request,supportPage);
    }

}

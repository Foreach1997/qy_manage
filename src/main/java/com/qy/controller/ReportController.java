package com.qy.controller;


import com.qy.entity.ReportBook;
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
}

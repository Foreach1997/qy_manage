package com.qy.service;

import com.qy.entity.ReportBook;
import com.qy.util.SupportPage;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface ReportBookService {
    /**
     * 申请项目(立项阶段)
     */
    Object insertReportBook(MultipartFile file, ReportBook reportBook, HttpServletRequest request);


    /**
     * 项目状态(立项阶段)
     */
    Object updatePro(ReportBook reportBook);


    /**
     * 查看立项项目
     */
    Object findReportBookList(ReportBook reportBook,Integer depId,HttpServletRequest request, SupportPage supportPage);

}

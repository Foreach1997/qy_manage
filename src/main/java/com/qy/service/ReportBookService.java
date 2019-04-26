package com.qy.service;

import com.qy.entity.PlanBook;
import com.qy.entity.ReportBook;
import com.qy.entity.TaskBook;
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

    /**
     * 查看项目计划
     */
    Object findPlanBookList(PlanBook planBook,Integer depId,HttpServletRequest request, SupportPage supportPage);

    /**
     * 提交计划(计划阶段)
     */
    Object insertPlanBook(MultipartFile file, PlanBook planBook, HttpServletRequest request);


    /**
     * 计划状态(计划阶段)
     */
    Object updatePlan(PlanBook planBook);

    /**
     * 查看项目任务
     */
    Object findTaskBookList(TaskBook taskBook, Integer depId, HttpServletRequest request, SupportPage supportPage);

    /**
     * 提交任务(任务阶段)
     */
    Object insertTaskBook(TaskBook taskBook,String start,String end,String isUpdate,HttpServletRequest request);


    /**
     * 任务状态(任务阶段)
     */
    Object updateTask(TaskBook taskBook);

    /**
     * 获取当前用户所有项目编码
     */
    Object findUserProCode(HttpServletRequest request);


}

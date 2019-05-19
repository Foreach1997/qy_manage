package com.qy.service;

import com.qy.entity.*;
import com.qy.util.SupportPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TaskBookService {

    /**
     * 添加工作人员
     */
   Object insertOrUpdateWorkStaff(WorkStaff workStaff,String endTime,String startTime,String isUpdate, HttpServletRequest request);


    /**
     * 查看我的任务
     */
    Object findWorkTaskList(WorkStaff workStaff,HttpServletRequest request, SupportPage supportPage);


    /**
     * 查看项目进行时提交的文件
     */
    Object findProgress(TaskBook taskBook, Integer depId, HttpServletRequest request, SupportPage supportPage);

    /**
     * 项目汇报
     */
    Object  reportTask(WorkStaff workStaff, HttpServletRequest request);

    /**
     * 当前项目状态
     */
    int taskStatus(String proCode);

    /**
     * 项目进度管理
     */
    Object proSpeedManage(TaskBook tBook,Integer depId,HttpServletRequest request, SupportPage supportPage);


   /**
    * 项目费用管理
    */
    Object proFeeManage(TaskBook tBook,Integer depId,HttpServletRequest request, SupportPage supportPage);

   /**
    * 项目(中止,完成,变更)
    */
    Object proStatusCause(TaskBook taskBook);

    /**
     *
     */
    void insertProStatus(Integer status,ProFinish proFinish, ProChange proChange, ProStop proStop,HttpServletRequest request);

    /**
     * 项目汇报内容查看
     */
    Object findReportNote(WorkStaff workStaff);


    /**
     * 评阅
     */
    Object workReview(WorkStaff workStaff);

    /**
     * 文件下载通用
     */
    Object DownFile(String file, HttpServletResponse response);


    /**
     * 项目进展下载
     */
    void downMakeFile(String proCode, String per, HttpServletResponse response);

   /**
    * 提交文件下载
    */
   void downPlanOrReport(String proCode,Integer reportBookId, String per, HttpServletResponse response);

    /**
     * 任务超时提醒
     */
    Object workWarn(HttpServletRequest request , HttpServletResponse response);

    /**
     *  任务状态修改
     */
    Object workStaffStatus(WorkStaff workStaff);
}
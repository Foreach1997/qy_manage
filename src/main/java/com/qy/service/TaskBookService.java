package com.qy.service;

import com.qy.entity.*;
import com.qy.util.SupportPage;

import javax.servlet.http.HttpServletRequest;

public interface TaskBookService {

    /**
     * 添加工作人员
     */
   Object insertOrUpdateWorkStaff(WorkStaff workStaff,String isUpdate, HttpServletRequest request);


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
}
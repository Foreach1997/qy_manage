package com.qy.service;

import com.qy.entity.TaskBook;
import com.qy.entity.WorkStaff;
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
}
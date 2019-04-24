package com.qy.dao;

import com.alibaba.fastjson.JSONObject;
import com.qy.entity.ReportBook;
import com.qy.entity.User;
import com.qy.entity.WorkStaff;

import java.util.List;
import java.util.Map;

public interface CurrencyMapper {

    /**
     * 查出当前部门下面所有user_id
     */
    public List<Integer>   findUserIdByDepId(Integer depId);

    /**
     * 查出当前部门下面所有立项的项目
     */
    public List<ReportBook> findReportBookList(Map<String,Object> map);

    public  int  findReportBookListCount(Map<String,Object> map);
    /**
     * 员工信息查询
     */
    public List<User> findUserList(User user);
    /**
     * 查出当前部门下面所有立项的计划
     */
    public List<JSONObject> findPlanBookList(Map<String,Object> map);

    public  int  findPlanBookListCount(Map<String,Object> map);
    /**
     * 查出当前部门下面所有立项的任务
     */
    public List<JSONObject> findTaskBookList(Map<String,Object> map);

    public  int  findTaskBookListCount(Map<String,Object> map);

    /**
     * 查出自己的任务
     */
    public List<JSONObject>  findWorkStaffList(Map<String,Object> map);

    public int findWorkStaffListCount(Map<String,Object> map);
}

package com.qy.dao;

import com.qy.entity.ReportBook;
import com.qy.entity.User;

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

}

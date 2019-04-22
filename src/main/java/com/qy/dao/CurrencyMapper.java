package com.qy.dao;

import com.qy.entity.ReportBook;
import com.qy.entity.User;

import java.util.List;

public interface CurrencyMapper {

    /**
     * 查出当前部门下面所有user_id
     */
    public List<Integer>   findUserIdByDepId(Integer depId);

    /**
     * 查出当前部门下面所有立项的项目
     */
    public List<ReportBook> findReportBookList(List<Integer> integers);

    /**
     * 员工信息查询
     */
    public List<User> findUserList(User user);

}

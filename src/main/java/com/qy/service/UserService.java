package com.qy.service;

import com.qy.entity.Notice;
import com.qy.entity.User;
import com.qy.util.SupportPage;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

public interface UserService {
    /**
     * 用户登录
     */
    Object userLogin(User user, HttpServletRequest request);

    /**
     * 用户信息修改
     */
    Object updateUser(User user,String isUpdate);

    /**
     * 退出登录
     */
    Object quit(HttpServletRequest request);

    /**
     * 用户添加
     */
    Object userInsert(User user);

    /**
     * 用户列表查询(roleId , depId) 用于总经理和部门经理
     */
    Object findUserList(User user, HttpServletRequest request, SupportPage supportPage) throws ParseException;

    /**
     * 用户登录检查
     */
    Object checkCode(HttpServletRequest request);

    /**
     * 用户信息回调
     */
    Object userInfo(User user);

    /**
     * 根据部门获取所有用户
     */
    Object findUsers(User user);

    /**
     * 添加公告
     */
    Object addNotice(Notice notice,HttpServletRequest request);

    /**
     * 获取公告
     */
    Object getNotice(HttpServletRequest request);
}

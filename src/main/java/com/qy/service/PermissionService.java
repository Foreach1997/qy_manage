package com.qy.service;

import com.qy.entity.Permission;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PermissionService {

    /**
     * 用户权限
     */
    List<Permission> findUserPermission(HttpServletRequest request);

}

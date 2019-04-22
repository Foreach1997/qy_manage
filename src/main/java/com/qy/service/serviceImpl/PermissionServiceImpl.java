package com.qy.service.serviceImpl;

import com.qy.dao.PermissionMapper;
import com.qy.dao.RoleMapper;
import com.qy.entity.Permission;
import com.qy.entity.PermissionExample;
import com.qy.service.PermissionService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;
    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Permission> findUserPermission(HttpServletRequest request) {
        PermissionExample permissionExample = new PermissionExample();
        permissionExample.createCriteria().andPermissionIdEqualTo
                (roleMapper.selectByPrimaryKey((int)request.getSession().getAttribute("roleId")).getPermissionId());

        List<Permission> permissions = permissionMapper.selectByExample(permissionExample);

        return permissions;
    }
}

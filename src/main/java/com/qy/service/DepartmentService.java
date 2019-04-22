package com.qy.service;


import com.qy.entity.Department;

public interface DepartmentService {

    /**
     * 获取所有部门
     */
    Object findAllDepartment();

    /**
     * 添加部门
     */
    Object insertDep(Department department);

}

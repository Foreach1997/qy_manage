package com.qy.service;


import com.qy.entity.Department;

public interface DepartmentService {

    /**
     * 获取部门
     */
    Object findAllDepartment(Department department);

    /**
     * 添加部门
     */
    Object insertDep(Department department);

}

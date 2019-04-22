package com.qy.service.serviceImpl;

import com.qy.dao.DepartmentMapper;
import com.qy.entity.Department;
import com.qy.entity.DepartmentExample;
import com.qy.service.DepartmentService;
import com.qy.service.UserService;
import com.qy.util.ResultRespose;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public Object findAllDepartment() {
        DepartmentExample example = new DepartmentExample();
        List<Department> departments = departmentMapper.selectByExample(example);
        return  ResultRespose.rsult(200,"请求成功",departments);
    }

    @Override
    public Object insertDep(Department department) {

       int val = departmentMapper.insert(department);

       if (val>0){
           return ResultRespose.rsult(200, "添加成功", null);

       }
        return ResultRespose.rsult(200, "添加失败", null);
    }
}

package com.qy.dao;

import com.qy.entity.WorkStaff;
import com.qy.entity.WorkStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkStaffMapper {
    long countByExample(WorkStaffExample example);

    int deleteByExample(WorkStaffExample example);

    int deleteByPrimaryKey(Integer workStaffId);

    int insert(WorkStaff record);

    int insertSelective(WorkStaff record);

    List<WorkStaff> selectByExample(WorkStaffExample example);

    WorkStaff selectByPrimaryKey(Integer workStaffId);

    int updateByExampleSelective(@Param("record") WorkStaff record, @Param("example") WorkStaffExample example);

    int updateByExample(@Param("record") WorkStaff record, @Param("example") WorkStaffExample example);

    int updateByPrimaryKeySelective(WorkStaff record);

    int updateByPrimaryKey(WorkStaff record);
}
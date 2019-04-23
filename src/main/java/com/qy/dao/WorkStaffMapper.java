package com.qy.dao;

import com.qy.entity.WorkStaff;
import com.qy.entity.WorkStaffExample;
import com.qy.entity.WorkStaffWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkStaffMapper {
    long countByExample(WorkStaffExample example);

    int deleteByExample(WorkStaffExample example);

    int deleteByPrimaryKey(Integer workStaffId);

    int insert(WorkStaffWithBLOBs record);

    int insertSelective(WorkStaffWithBLOBs record);

    List<WorkStaffWithBLOBs> selectByExampleWithBLOBs(WorkStaffExample example);

    List<WorkStaff> selectByExample(WorkStaffExample example);

    WorkStaffWithBLOBs selectByPrimaryKey(Integer workStaffId);

    int updateByExampleSelective(@Param("record") WorkStaffWithBLOBs record, @Param("example") WorkStaffExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkStaffWithBLOBs record, @Param("example") WorkStaffExample example);

    int updateByExample(@Param("record") WorkStaff record, @Param("example") WorkStaffExample example);

    int updateByPrimaryKeySelective(WorkStaffWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WorkStaffWithBLOBs record);

    int updateByPrimaryKey(WorkStaff record);
}
package com.qy.dao;

import com.qy.entity.PlanBook;
import com.qy.entity.PlanBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanBookMapper {
    long countByExample(PlanBookExample example);

    int deleteByExample(PlanBookExample example);

    int deleteByPrimaryKey(Integer planBookId);

    int insert(PlanBook record);

    int insertSelective(PlanBook record);

    List<PlanBook> selectByExample(PlanBookExample example);

    PlanBook selectByPrimaryKey(Integer planBookId);

    int updateByExampleSelective(@Param("record") PlanBook record, @Param("example") PlanBookExample example);

    int updateByExample(@Param("record") PlanBook record, @Param("example") PlanBookExample example);

    int updateByPrimaryKeySelective(PlanBook record);

    int updateByPrimaryKey(PlanBook record);
}
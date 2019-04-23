package com.qy.dao;

import com.qy.entity.ProMake;
import com.qy.entity.ProMakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProMakeMapper {
    long countByExample(ProMakeExample example);

    int deleteByExample(ProMakeExample example);

    int deleteByPrimaryKey(Integer makeId);

    int insert(ProMake record);

    int insertSelective(ProMake record);

    List<ProMake> selectByExample(ProMakeExample example);

    ProMake selectByPrimaryKey(Integer makeId);

    int updateByExampleSelective(@Param("record") ProMake record, @Param("example") ProMakeExample example);

    int updateByExample(@Param("record") ProMake record, @Param("example") ProMakeExample example);

    int updateByPrimaryKeySelective(ProMake record);

    int updateByPrimaryKey(ProMake record);
}
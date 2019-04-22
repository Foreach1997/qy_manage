package com.qy.dao;

import com.qy.entity.TaskBook;
import com.qy.entity.TaskBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskBookMapper {
    long countByExample(TaskBookExample example);

    int deleteByExample(TaskBookExample example);

    int deleteByPrimaryKey(Integer taskBookId);

    int insert(TaskBook record);

    int insertSelective(TaskBook record);

    List<TaskBook> selectByExample(TaskBookExample example);

    TaskBook selectByPrimaryKey(Integer taskBookId);

    int updateByExampleSelective(@Param("record") TaskBook record, @Param("example") TaskBookExample example);

    int updateByExample(@Param("record") TaskBook record, @Param("example") TaskBookExample example);

    int updateByPrimaryKeySelective(TaskBook record);

    int updateByPrimaryKey(TaskBook record);
}
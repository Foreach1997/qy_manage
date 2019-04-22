package com.qy.dao;

import com.qy.entity.ReportBook;
import com.qy.entity.ReportBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportBookMapper {
    long countByExample(ReportBookExample example);

    int deleteByExample(ReportBookExample example);

    int deleteByPrimaryKey(Integer reportBookId);

    int insert(ReportBook record);

    int insertSelective(ReportBook record);

    List<ReportBook> selectByExample(ReportBookExample example);

    ReportBook selectByPrimaryKey(Integer reportBookId);

    int updateByExampleSelective(@Param("record") ReportBook record, @Param("example") ReportBookExample example);

    int updateByExample(@Param("record") ReportBook record, @Param("example") ReportBookExample example);

    int updateByPrimaryKeySelective(ReportBook record);

    int updateByPrimaryKey(ReportBook record);
}
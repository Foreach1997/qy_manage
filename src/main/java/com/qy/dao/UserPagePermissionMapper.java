package com.qy.dao;

import com.qy.entity.UserPagePermission;
import com.qy.entity.UserPagePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface UserPagePermissionMapper {
    long countByExample(UserPagePermissionExample example);

    int deleteByExample(UserPagePermissionExample example);

    int deleteByPrimaryKey(Integer pageViewId);

    int insert(UserPagePermission record);

    int insertSelective(UserPagePermission record);

    List<UserPagePermission> selectByExample(UserPagePermissionExample example);

    UserPagePermission selectByPrimaryKey(Integer pageViewId);

    int updateByExampleSelective(@Param("record") UserPagePermission record, @Param("example") UserPagePermissionExample example);

    int updateByExample(@Param("record") UserPagePermission record, @Param("example") UserPagePermissionExample example);

    int updateByPrimaryKeySelective(UserPagePermission record);

    int updateByPrimaryKey(UserPagePermission record);
}
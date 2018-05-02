package com.whut.shuini.dao;

import com.whut.shuini.entity.PermissionRoleExample;
import com.whut.shuini.entity.PermissionRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionRoleMapper {
    long countByExample(PermissionRoleExample example);

    int deleteByExample(PermissionRoleExample example);

    int deleteByPrimaryKey(PermissionRoleKey key);

    int insert(PermissionRoleKey record);

    int insertSelective(PermissionRoleKey record);

    List<PermissionRoleKey> selectByExample(PermissionRoleExample example);

    int updateByExampleSelective(@Param("record") PermissionRoleKey record, @Param("example") PermissionRoleExample example);

    int updateByExample(@Param("record") PermissionRoleKey record, @Param("example") PermissionRoleExample example);
}
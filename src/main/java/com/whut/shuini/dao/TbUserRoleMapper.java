package com.whut.shuini.dao;

import com.whut.shuini.entity.TbUserRole;
import com.whut.shuini.entity.TbUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserRoleMapper {
    long countByExample(TbUserRoleExample example);

    int deleteByExample(TbUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserRole record);

    int insertSelective(TbUserRole record);

    List<TbUserRole> selectByExample(TbUserRoleExample example);

    TbUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);

    int updateByExample(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);

    int updateByPrimaryKeySelective(TbUserRole record);

    int updateByPrimaryKey(TbUserRole record);
}
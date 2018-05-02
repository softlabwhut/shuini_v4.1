package com.whut.shuini.dao;

import com.whut.shuini.entity.TbRolePrivilege;
import com.whut.shuini.entity.TbRolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRolePrivilegeMapper {
    long countByExample(TbRolePrivilegeExample example);

    int deleteByExample(TbRolePrivilegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRolePrivilege record);

    int insertSelective(TbRolePrivilege record);

    List<TbRolePrivilege> selectByExample(TbRolePrivilegeExample example);

    TbRolePrivilege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRolePrivilege record, @Param("example") TbRolePrivilegeExample example);

    int updateByExample(@Param("record") TbRolePrivilege record, @Param("example") TbRolePrivilegeExample example);

    int updateByPrimaryKeySelective(TbRolePrivilege record);

    int updateByPrimaryKey(TbRolePrivilege record);
}
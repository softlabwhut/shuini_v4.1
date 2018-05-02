package com.whut.shuini.dao;

import com.whut.shuini.entity.TbPrivilege;
import com.whut.shuini.entity.TbPrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPrivilegeMapper {
    long countByExample(TbPrivilegeExample example);

    int deleteByExample(TbPrivilegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPrivilege record);

    int insertSelective(TbPrivilege record);

    List<TbPrivilege> selectByExample(TbPrivilegeExample example);

    TbPrivilege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPrivilege record, @Param("example") TbPrivilegeExample example);

    int updateByExample(@Param("record") TbPrivilege record, @Param("example") TbPrivilegeExample example);

    int updateByPrimaryKeySelective(TbPrivilege record);

    int updateByPrimaryKey(TbPrivilege record);
}
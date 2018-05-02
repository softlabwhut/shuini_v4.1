package com.whut.shuini.dao;

import com.whut.shuini.entity.TbRegion;
import com.whut.shuini.entity.TbRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRegionMapper {
    long countByExample(TbRegionExample example);

    int deleteByExample(TbRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRegion record);

    int insertSelective(TbRegion record);

    List<TbRegion> selectByExample(TbRegionExample example);

    TbRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRegion record, @Param("example") TbRegionExample example);

    int updateByExample(@Param("record") TbRegion record, @Param("example") TbRegionExample example);

    int updateByPrimaryKeySelective(TbRegion record);

    int updateByPrimaryKey(TbRegion record);
}
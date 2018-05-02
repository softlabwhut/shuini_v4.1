package com.whut.shuini.dao;

import com.whut.shuini.entity.TbNews;
import com.whut.shuini.entity.TbNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNewsMapper {
    long countByExample(TbNewsExample example);

    int deleteByExample(TbNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbNews record);

    int insertSelective(TbNews record);

    List<TbNews> selectByExample(TbNewsExample example);

    TbNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByExample(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByPrimaryKeySelective(TbNews record);

    int updateByPrimaryKey(TbNews record);
}
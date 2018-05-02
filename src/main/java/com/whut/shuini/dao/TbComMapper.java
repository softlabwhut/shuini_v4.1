package com.whut.shuini.dao;

import com.whut.shuini.entity.TbCom;
import com.whut.shuini.entity.TbComExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbComMapper {
    long countByExample(TbComExample example);

    int deleteByExample(TbComExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCom record);

    int insertSelective(TbCom record);

    List<TbCom> selectByExample(TbComExample example);

    TbCom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCom record, @Param("example") TbComExample example);

    int updateByExample(@Param("record") TbCom record, @Param("example") TbComExample example);

    int updateByPrimaryKeySelective(TbCom record);

    int updateByPrimaryKey(TbCom record);
}
package com.whut.shuini.dao;

import com.whut.shuini.entity.TbQuestionnaireContent;
import com.whut.shuini.entity.TbQuestionnaireContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionnaireContentMapper {
    long countByExample(TbQuestionnaireContentExample example);

    int deleteByExample(TbQuestionnaireContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbQuestionnaireContent record);

    int insertSelective(TbQuestionnaireContent record);

    List<TbQuestionnaireContent> selectByExample(TbQuestionnaireContentExample example);

    TbQuestionnaireContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbQuestionnaireContent record, @Param("example") TbQuestionnaireContentExample example);

    int updateByExample(@Param("record") TbQuestionnaireContent record, @Param("example") TbQuestionnaireContentExample example);

    int updateByPrimaryKeySelective(TbQuestionnaireContent record);

    int updateByPrimaryKey(TbQuestionnaireContent record);
}
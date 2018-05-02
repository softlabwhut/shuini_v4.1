package com.whut.shuini.dao;

import com.whut.shuini.entity.TbQuestionnaireTemplateEdit;
import com.whut.shuini.entity.TbQuestionnaireTemplateEditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionnaireTemplateEditMapper {
    long countByExample(TbQuestionnaireTemplateEditExample example);

    int deleteByExample(TbQuestionnaireTemplateEditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbQuestionnaireTemplateEdit record);

    int insertSelective(TbQuestionnaireTemplateEdit record);

    List<TbQuestionnaireTemplateEdit> selectByExample(TbQuestionnaireTemplateEditExample example);

    TbQuestionnaireTemplateEdit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbQuestionnaireTemplateEdit record, @Param("example") TbQuestionnaireTemplateEditExample example);

    int updateByExample(@Param("record") TbQuestionnaireTemplateEdit record, @Param("example") TbQuestionnaireTemplateEditExample example);

    int updateByPrimaryKeySelective(TbQuestionnaireTemplateEdit record);

    int updateByPrimaryKey(TbQuestionnaireTemplateEdit record);
}
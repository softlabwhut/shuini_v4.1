package com.whut.shuini.dao;

import com.whut.shuini.entity.TbQuestionnaireTemplate;
import com.whut.shuini.entity.TbQuestionnaireTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionnaireTemplateMapper {
    long countByExample(TbQuestionnaireTemplateExample example);

    int deleteByExample(TbQuestionnaireTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbQuestionnaireTemplate record);

    int insertSelective(TbQuestionnaireTemplate record);

    List<TbQuestionnaireTemplate> selectByExample(TbQuestionnaireTemplateExample example);

    TbQuestionnaireTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbQuestionnaireTemplate record, @Param("example") TbQuestionnaireTemplateExample example);

    int updateByExample(@Param("record") TbQuestionnaireTemplate record, @Param("example") TbQuestionnaireTemplateExample example);

    int updateByPrimaryKeySelective(TbQuestionnaireTemplate record);

    int updateByPrimaryKey(TbQuestionnaireTemplate record);
}
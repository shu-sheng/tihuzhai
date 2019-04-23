package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyTemplate;
import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftMoneyTemplateMapper {
    int countByExample(GiftMoneyTemplateExample example);

    int deleteByExample(GiftMoneyTemplateExample example);

    int deleteByPrimaryKey(Long templateId);

    int insert(GiftMoneyTemplate record);

    int insertSelective(GiftMoneyTemplate record);

    List<GiftMoneyTemplate> selectByExample(GiftMoneyTemplateExample example);

    GiftMoneyTemplate selectByPrimaryKey(Long templateId);

    int updateByExampleSelective(@Param("record") GiftMoneyTemplate record, @Param("example") GiftMoneyTemplateExample example);

    int updateByExample(@Param("record") GiftMoneyTemplate record, @Param("example") GiftMoneyTemplateExample example);

    int updateByPrimaryKeySelective(GiftMoneyTemplate record);

    int updateByPrimaryKey(GiftMoneyTemplate record);
}
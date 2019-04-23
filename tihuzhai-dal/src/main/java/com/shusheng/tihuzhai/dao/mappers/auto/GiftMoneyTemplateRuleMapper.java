package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyTemplateRule;
import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyTemplateRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftMoneyTemplateRuleMapper {
    int countByExample(GiftMoneyTemplateRuleExample example);

    int deleteByExample(GiftMoneyTemplateRuleExample example);

    int deleteByPrimaryKey(Long ruleId);

    int insert(GiftMoneyTemplateRule record);

    int insertSelective(GiftMoneyTemplateRule record);

    List<GiftMoneyTemplateRule> selectByExample(GiftMoneyTemplateRuleExample example);

    GiftMoneyTemplateRule selectByPrimaryKey(Long ruleId);

    int updateByExampleSelective(@Param("record") GiftMoneyTemplateRule record, @Param("example") GiftMoneyTemplateRuleExample example);

    int updateByExample(@Param("record") GiftMoneyTemplateRule record, @Param("example") GiftMoneyTemplateRuleExample example);

    int updateByPrimaryKeySelective(GiftMoneyTemplateRule record);

    int updateByPrimaryKey(GiftMoneyTemplateRule record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyRule;
import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftMoneyRuleMapper {
    int countByExample(GiftMoneyRuleExample example);

    int deleteByExample(GiftMoneyRuleExample example);

    int deleteByPrimaryKey(Long giftRuleId);

    int insert(GiftMoneyRule record);

    int insertSelective(GiftMoneyRule record);

    List<GiftMoneyRule> selectByExample(GiftMoneyRuleExample example);

    GiftMoneyRule selectByPrimaryKey(Long giftRuleId);

    int updateByExampleSelective(@Param("record") GiftMoneyRule record, @Param("example") GiftMoneyRuleExample example);

    int updateByExample(@Param("record") GiftMoneyRule record, @Param("example") GiftMoneyRuleExample example);

    int updateByPrimaryKeySelective(GiftMoneyRule record);

    int updateByPrimaryKey(GiftMoneyRule record);
}
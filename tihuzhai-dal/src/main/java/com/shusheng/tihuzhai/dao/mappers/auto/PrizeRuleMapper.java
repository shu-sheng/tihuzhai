package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PrizeRule;
import com.shusheng.tihuzhai.dao.entity.auto.PrizeRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeRuleMapper {
    int countByExample(PrizeRuleExample example);

    int deleteByExample(PrizeRuleExample example);

    int deleteByPrimaryKey(Long prizeRuleId);

    int insert(PrizeRule record);

    int insertSelective(PrizeRule record);

    List<PrizeRule> selectByExample(PrizeRuleExample example);

    PrizeRule selectByPrimaryKey(Long prizeRuleId);

    int updateByExampleSelective(@Param("record") PrizeRule record, @Param("example") PrizeRuleExample example);

    int updateByExample(@Param("record") PrizeRule record, @Param("example") PrizeRuleExample example);

    int updateByPrimaryKeySelective(PrizeRule record);

    int updateByPrimaryKey(PrizeRule record);
}
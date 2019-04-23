package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PrizeRuleDetail;
import com.shusheng.tihuzhai.dao.entity.auto.PrizeRuleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeRuleDetailMapper {
    int countByExample(PrizeRuleDetailExample example);

    int deleteByExample(PrizeRuleDetailExample example);

    int deleteByPrimaryKey(Long prizeRuleDetailId);

    int insert(PrizeRuleDetail record);

    int insertSelective(PrizeRuleDetail record);

    List<PrizeRuleDetail> selectByExample(PrizeRuleDetailExample example);

    PrizeRuleDetail selectByPrimaryKey(Long prizeRuleDetailId);

    int updateByExampleSelective(@Param("record") PrizeRuleDetail record, @Param("example") PrizeRuleDetailExample example);

    int updateByExample(@Param("record") PrizeRuleDetail record, @Param("example") PrizeRuleDetailExample example);

    int updateByPrimaryKeySelective(PrizeRuleDetail record);

    int updateByPrimaryKey(PrizeRuleDetail record);
}
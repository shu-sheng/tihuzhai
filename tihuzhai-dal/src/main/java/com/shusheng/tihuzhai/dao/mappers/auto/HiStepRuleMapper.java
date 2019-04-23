package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiStepRule;
import com.shusheng.tihuzhai.dao.entity.auto.HiStepRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiStepRuleMapper {
    int countByExample(HiStepRuleExample example);

    int deleteByExample(HiStepRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiStepRule record);

    int insertSelective(HiStepRule record);

    List<HiStepRule> selectByExample(HiStepRuleExample example);

    HiStepRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiStepRule record, @Param("example") HiStepRuleExample example);

    int updateByExample(@Param("record") HiStepRule record, @Param("example") HiStepRuleExample example);

    int updateByPrimaryKeySelective(HiStepRule record);

    int updateByPrimaryKey(HiStepRule record);
}
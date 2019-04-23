package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.LotteryCondition;
import com.shusheng.tihuzhai.dao.entity.auto.LotteryConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryConditionMapper {
    int countByExample(LotteryConditionExample example);

    int deleteByExample(LotteryConditionExample example);

    int deleteByPrimaryKey(Long lotteryConditionId);

    int insert(LotteryCondition record);

    int insertSelective(LotteryCondition record);

    List<LotteryCondition> selectByExample(LotteryConditionExample example);

    LotteryCondition selectByPrimaryKey(Long lotteryConditionId);

    int updateByExampleSelective(@Param("record") LotteryCondition record, @Param("example") LotteryConditionExample example);

    int updateByExample(@Param("record") LotteryCondition record, @Param("example") LotteryConditionExample example);

    int updateByPrimaryKeySelective(LotteryCondition record);

    int updateByPrimaryKey(LotteryCondition record);
}
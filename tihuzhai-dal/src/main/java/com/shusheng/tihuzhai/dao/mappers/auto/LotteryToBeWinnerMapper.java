package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.LotteryToBeWinner;
import com.shusheng.tihuzhai.dao.entity.auto.LotteryToBeWinnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryToBeWinnerMapper {
    int countByExample(LotteryToBeWinnerExample example);

    int deleteByExample(LotteryToBeWinnerExample example);

    int deleteByPrimaryKey(Long toBeWinnerId);

    int insert(LotteryToBeWinner record);

    int insertSelective(LotteryToBeWinner record);

    List<LotteryToBeWinner> selectByExample(LotteryToBeWinnerExample example);

    LotteryToBeWinner selectByPrimaryKey(Long toBeWinnerId);

    int updateByExampleSelective(@Param("record") LotteryToBeWinner record, @Param("example") LotteryToBeWinnerExample example);

    int updateByExample(@Param("record") LotteryToBeWinner record, @Param("example") LotteryToBeWinnerExample example);

    int updateByPrimaryKeySelective(LotteryToBeWinner record);

    int updateByPrimaryKey(LotteryToBeWinner record);
}
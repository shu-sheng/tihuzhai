package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.LotteryWinner;
import com.shusheng.tihuzhai.dao.entity.auto.LotteryWinnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryWinnerMapper {
    int countByExample(LotteryWinnerExample example);

    int deleteByExample(LotteryWinnerExample example);

    int deleteByPrimaryKey(Long winnerId);

    int insert(LotteryWinner record);

    int insertSelective(LotteryWinner record);

    List<LotteryWinner> selectByExample(LotteryWinnerExample example);

    LotteryWinner selectByPrimaryKey(Long winnerId);

    int updateByExampleSelective(@Param("record") LotteryWinner record, @Param("example") LotteryWinnerExample example);

    int updateByExample(@Param("record") LotteryWinner record, @Param("example") LotteryWinnerExample example);

    int updateByPrimaryKeySelective(LotteryWinner record);

    int updateByPrimaryKey(LotteryWinner record);
}
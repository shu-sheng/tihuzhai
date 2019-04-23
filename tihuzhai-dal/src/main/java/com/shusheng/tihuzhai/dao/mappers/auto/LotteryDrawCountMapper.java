package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.LotteryDrawCount;
import com.shusheng.tihuzhai.dao.entity.auto.LotteryDrawCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryDrawCountMapper {
    int countByExample(LotteryDrawCountExample example);

    int deleteByExample(LotteryDrawCountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LotteryDrawCount record);

    int insertSelective(LotteryDrawCount record);

    List<LotteryDrawCount> selectByExample(LotteryDrawCountExample example);

    LotteryDrawCount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LotteryDrawCount record, @Param("example") LotteryDrawCountExample example);

    int updateByExample(@Param("record") LotteryDrawCount record, @Param("example") LotteryDrawCountExample example);

    int updateByPrimaryKeySelective(LotteryDrawCount record);

    int updateByPrimaryKey(LotteryDrawCount record);
}
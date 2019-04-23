package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.LotteryActivityInstance;
import com.shusheng.tihuzhai.dao.entity.auto.LotteryActivityInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryActivityInstanceMapper {
    int countByExample(LotteryActivityInstanceExample example);

    int deleteByExample(LotteryActivityInstanceExample example);

    int deleteByPrimaryKey(Long instanceId);

    int insert(LotteryActivityInstance record);

    int insertSelective(LotteryActivityInstance record);

    List<LotteryActivityInstance> selectByExample(LotteryActivityInstanceExample example);

    LotteryActivityInstance selectByPrimaryKey(Long instanceId);

    int updateByExampleSelective(@Param("record") LotteryActivityInstance record, @Param("example") LotteryActivityInstanceExample example);

    int updateByExample(@Param("record") LotteryActivityInstance record, @Param("example") LotteryActivityInstanceExample example);

    int updateByPrimaryKeySelective(LotteryActivityInstance record);

    int updateByPrimaryKey(LotteryActivityInstance record);
}
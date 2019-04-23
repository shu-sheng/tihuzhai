package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.LotteryActivity;
import com.shusheng.tihuzhai.dao.entity.auto.LotteryActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryActivityMapper {
    int countByExample(LotteryActivityExample example);

    int deleteByExample(LotteryActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LotteryActivity record);

    int insertSelective(LotteryActivity record);

    List<LotteryActivity> selectByExample(LotteryActivityExample example);

    LotteryActivity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LotteryActivity record, @Param("example") LotteryActivityExample example);

    int updateByExample(@Param("record") LotteryActivity record, @Param("example") LotteryActivityExample example);

    int updateByPrimaryKeySelective(LotteryActivity record);

    int updateByPrimaryKey(LotteryActivity record);
}
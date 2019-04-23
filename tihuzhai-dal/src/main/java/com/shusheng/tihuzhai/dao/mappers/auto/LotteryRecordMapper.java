package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.LotteryRecord;
import com.shusheng.tihuzhai.dao.entity.auto.LotteryRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LotteryRecordMapper {
    int countByExample(LotteryRecordExample example);

    int deleteByExample(LotteryRecordExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(LotteryRecord record);

    int insertSelective(LotteryRecord record);

    List<LotteryRecord> selectByExample(LotteryRecordExample example);

    LotteryRecord selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") LotteryRecord record, @Param("example") LotteryRecordExample example);

    int updateByExample(@Param("record") LotteryRecord record, @Param("example") LotteryRecordExample example);

    int updateByPrimaryKeySelective(LotteryRecord record);

    int updateByPrimaryKey(LotteryRecord record);
}
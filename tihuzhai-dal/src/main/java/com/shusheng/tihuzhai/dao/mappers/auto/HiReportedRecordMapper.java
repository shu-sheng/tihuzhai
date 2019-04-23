package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiReportedRecord;
import com.shusheng.tihuzhai.dao.entity.auto.HiReportedRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiReportedRecordMapper {
    int countByExample(HiReportedRecordExample example);

    int deleteByExample(HiReportedRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiReportedRecord record);

    int insertSelective(HiReportedRecord record);

    List<HiReportedRecord> selectByExample(HiReportedRecordExample example);

    HiReportedRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiReportedRecord record, @Param("example") HiReportedRecordExample example);

    int updateByExample(@Param("record") HiReportedRecord record, @Param("example") HiReportedRecordExample example);

    int updateByPrimaryKeySelective(HiReportedRecord record);

    int updateByPrimaryKey(HiReportedRecord record);
}
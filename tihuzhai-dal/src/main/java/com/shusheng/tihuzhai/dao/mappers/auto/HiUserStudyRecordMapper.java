package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiUserStudyRecord;
import com.shusheng.tihuzhai.dao.entity.auto.HiUserStudyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiUserStudyRecordMapper {
    int countByExample(HiUserStudyRecordExample example);

    int deleteByExample(HiUserStudyRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiUserStudyRecord record);

    int insertSelective(HiUserStudyRecord record);

    List<HiUserStudyRecord> selectByExample(HiUserStudyRecordExample example);

    HiUserStudyRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiUserStudyRecord record, @Param("example") HiUserStudyRecordExample example);

    int updateByExample(@Param("record") HiUserStudyRecord record, @Param("example") HiUserStudyRecordExample example);

    int updateByPrimaryKeySelective(HiUserStudyRecord record);

    int updateByPrimaryKey(HiUserStudyRecord record);
}
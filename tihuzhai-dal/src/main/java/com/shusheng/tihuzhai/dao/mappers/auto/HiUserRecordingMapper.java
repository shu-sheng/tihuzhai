package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiUserRecording;
import com.shusheng.tihuzhai.dao.entity.auto.HiUserRecordingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiUserRecordingMapper {
    int countByExample(HiUserRecordingExample example);

    int deleteByExample(HiUserRecordingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiUserRecording record);

    int insertSelective(HiUserRecording record);

    List<HiUserRecording> selectByExample(HiUserRecordingExample example);

    HiUserRecording selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiUserRecording record, @Param("example") HiUserRecordingExample example);

    int updateByExample(@Param("record") HiUserRecording record, @Param("example") HiUserRecordingExample example);

    int updateByPrimaryKeySelective(HiUserRecording record);

    int updateByPrimaryKey(HiUserRecording record);
}
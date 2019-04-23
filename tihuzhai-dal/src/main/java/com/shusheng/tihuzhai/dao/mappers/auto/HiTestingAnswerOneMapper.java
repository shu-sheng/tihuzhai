package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTestingAnswerOne;
import com.shusheng.tihuzhai.dao.entity.auto.HiTestingAnswerOneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTestingAnswerOneMapper {
    int countByExample(HiTestingAnswerOneExample example);

    int deleteByExample(HiTestingAnswerOneExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTestingAnswerOne record);

    int insertSelective(HiTestingAnswerOne record);

    List<HiTestingAnswerOne> selectByExample(HiTestingAnswerOneExample example);

    HiTestingAnswerOne selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTestingAnswerOne record, @Param("example") HiTestingAnswerOneExample example);

    int updateByExample(@Param("record") HiTestingAnswerOne record, @Param("example") HiTestingAnswerOneExample example);

    int updateByPrimaryKeySelective(HiTestingAnswerOne record);

    int updateByPrimaryKey(HiTestingAnswerOne record);
}
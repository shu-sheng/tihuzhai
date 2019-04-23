package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiVideoSentence;
import com.shusheng.tihuzhai.dao.entity.auto.HiVideoSentenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiVideoSentenceMapper {
    int countByExample(HiVideoSentenceExample example);

    int deleteByExample(HiVideoSentenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiVideoSentence record);

    int insertSelective(HiVideoSentence record);

    List<HiVideoSentence> selectByExample(HiVideoSentenceExample example);

    HiVideoSentence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiVideoSentence record, @Param("example") HiVideoSentenceExample example);

    int updateByExample(@Param("record") HiVideoSentence record, @Param("example") HiVideoSentenceExample example);

    int updateByPrimaryKeySelective(HiVideoSentence record);

    int updateByPrimaryKey(HiVideoSentence record);
}
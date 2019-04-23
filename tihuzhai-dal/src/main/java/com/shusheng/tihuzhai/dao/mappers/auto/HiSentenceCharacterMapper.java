package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiSentenceCharacter;
import com.shusheng.tihuzhai.dao.entity.auto.HiSentenceCharacterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiSentenceCharacterMapper {
    int countByExample(HiSentenceCharacterExample example);

    int deleteByExample(HiSentenceCharacterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiSentenceCharacter record);

    int insertSelective(HiSentenceCharacter record);

    List<HiSentenceCharacter> selectByExample(HiSentenceCharacterExample example);

    HiSentenceCharacter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiSentenceCharacter record, @Param("example") HiSentenceCharacterExample example);

    int updateByExample(@Param("record") HiSentenceCharacter record, @Param("example") HiSentenceCharacterExample example);

    int updateByPrimaryKeySelective(HiSentenceCharacter record);

    int updateByPrimaryKey(HiSentenceCharacter record);
}
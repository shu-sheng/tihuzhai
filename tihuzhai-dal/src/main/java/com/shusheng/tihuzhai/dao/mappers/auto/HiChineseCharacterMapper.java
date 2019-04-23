package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiChineseCharacter;
import com.shusheng.tihuzhai.dao.entity.auto.HiChineseCharacterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiChineseCharacterMapper {
    int countByExample(HiChineseCharacterExample example);

    int deleteByExample(HiChineseCharacterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiChineseCharacter record);

    int insertSelective(HiChineseCharacter record);

    List<HiChineseCharacter> selectByExample(HiChineseCharacterExample example);

    HiChineseCharacter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiChineseCharacter record, @Param("example") HiChineseCharacterExample example);

    int updateByExample(@Param("record") HiChineseCharacter record, @Param("example") HiChineseCharacterExample example);

    int updateByPrimaryKeySelective(HiChineseCharacter record);

    int updateByPrimaryKey(HiChineseCharacter record);
}
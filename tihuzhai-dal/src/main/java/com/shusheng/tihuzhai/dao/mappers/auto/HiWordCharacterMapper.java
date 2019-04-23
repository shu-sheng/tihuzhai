package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiWordCharacter;
import com.shusheng.tihuzhai.dao.entity.auto.HiWordCharacterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiWordCharacterMapper {
    int countByExample(HiWordCharacterExample example);

    int deleteByExample(HiWordCharacterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiWordCharacter record);

    int insertSelective(HiWordCharacter record);

    List<HiWordCharacter> selectByExample(HiWordCharacterExample example);

    HiWordCharacter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiWordCharacter record, @Param("example") HiWordCharacterExample example);

    int updateByExample(@Param("record") HiWordCharacter record, @Param("example") HiWordCharacterExample example);

    int updateByPrimaryKeySelective(HiWordCharacter record);

    int updateByPrimaryKey(HiWordCharacter record);
}
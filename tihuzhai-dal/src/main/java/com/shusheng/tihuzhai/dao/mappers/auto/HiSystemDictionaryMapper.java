package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiSystemDictionary;
import com.shusheng.tihuzhai.dao.entity.auto.HiSystemDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiSystemDictionaryMapper {
    int countByExample(HiSystemDictionaryExample example);

    int deleteByExample(HiSystemDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiSystemDictionary record);

    int insertSelective(HiSystemDictionary record);

    List<HiSystemDictionary> selectByExample(HiSystemDictionaryExample example);

    HiSystemDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiSystemDictionary record, @Param("example") HiSystemDictionaryExample example);

    int updateByExample(@Param("record") HiSystemDictionary record, @Param("example") HiSystemDictionaryExample example);

    int updateByPrimaryKeySelective(HiSystemDictionary record);

    int updateByPrimaryKey(HiSystemDictionary record);
}
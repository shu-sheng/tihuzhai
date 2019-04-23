package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiSystemDictionaryItem;
import com.shusheng.tihuzhai.dao.entity.auto.HiSystemDictionaryItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiSystemDictionaryItemMapper {
    int countByExample(HiSystemDictionaryItemExample example);

    int deleteByExample(HiSystemDictionaryItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiSystemDictionaryItem record);

    int insertSelective(HiSystemDictionaryItem record);

    List<HiSystemDictionaryItem> selectByExample(HiSystemDictionaryItemExample example);

    HiSystemDictionaryItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiSystemDictionaryItem record, @Param("example") HiSystemDictionaryItemExample example);

    int updateByExample(@Param("record") HiSystemDictionaryItem record, @Param("example") HiSystemDictionaryItemExample example);

    int updateByPrimaryKeySelective(HiSystemDictionaryItem record);

    int updateByPrimaryKey(HiSystemDictionaryItem record);
}
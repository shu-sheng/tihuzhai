package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiChineseWord;
import com.shusheng.tihuzhai.dao.entity.auto.HiChineseWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiChineseWordMapper {
    int countByExample(HiChineseWordExample example);

    int deleteByExample(HiChineseWordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiChineseWord record);

    int insertSelective(HiChineseWord record);

    List<HiChineseWord> selectByExample(HiChineseWordExample example);

    HiChineseWord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiChineseWord record, @Param("example") HiChineseWordExample example);

    int updateByExample(@Param("record") HiChineseWord record, @Param("example") HiChineseWordExample example);

    int updateByPrimaryKeySelective(HiChineseWord record);

    int updateByPrimaryKey(HiChineseWord record);
}
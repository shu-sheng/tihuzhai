package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiInternationalization;
import com.shusheng.tihuzhai.dao.entity.auto.HiInternationalizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiInternationalizationMapper {
    int countByExample(HiInternationalizationExample example);

    int deleteByExample(HiInternationalizationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiInternationalization record);

    int insertSelective(HiInternationalization record);

    List<HiInternationalization> selectByExample(HiInternationalizationExample example);

    HiInternationalization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiInternationalization record, @Param("example") HiInternationalizationExample example);

    int updateByExample(@Param("record") HiInternationalization record, @Param("example") HiInternationalizationExample example);

    int updateByPrimaryKeySelective(HiInternationalization record);

    int updateByPrimaryKey(HiInternationalization record);
}
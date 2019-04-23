package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiCountry;
import com.shusheng.tihuzhai.dao.entity.auto.HiCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiCountryMapper {
    int countByExample(HiCountryExample example);

    int deleteByExample(HiCountryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiCountry record);

    int insertSelective(HiCountry record);

    List<HiCountry> selectByExample(HiCountryExample example);

    HiCountry selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiCountry record, @Param("example") HiCountryExample example);

    int updateByExample(@Param("record") HiCountry record, @Param("example") HiCountryExample example);

    int updateByPrimaryKeySelective(HiCountry record);

    int updateByPrimaryKey(HiCountry record);
}
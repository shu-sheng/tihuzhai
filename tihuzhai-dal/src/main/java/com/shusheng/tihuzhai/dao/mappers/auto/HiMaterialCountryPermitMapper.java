package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiMaterialCountryPermit;
import com.shusheng.tihuzhai.dao.entity.auto.HiMaterialCountryPermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiMaterialCountryPermitMapper {
    int countByExample(HiMaterialCountryPermitExample example);

    int deleteByExample(HiMaterialCountryPermitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiMaterialCountryPermit record);

    int insertSelective(HiMaterialCountryPermit record);

    List<HiMaterialCountryPermit> selectByExample(HiMaterialCountryPermitExample example);

    HiMaterialCountryPermit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiMaterialCountryPermit record, @Param("example") HiMaterialCountryPermitExample example);

    int updateByExample(@Param("record") HiMaterialCountryPermit record, @Param("example") HiMaterialCountryPermitExample example);

    int updateByPrimaryKeySelective(HiMaterialCountryPermit record);

    int updateByPrimaryKey(HiMaterialCountryPermit record);
}
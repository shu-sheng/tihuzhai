package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.CommonDistrict;
import com.shusheng.tihuzhai.dao.entity.auto.CommonDistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonDistrictMapper {
    int countByExample(CommonDistrictExample example);

    int deleteByExample(CommonDistrictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonDistrict record);

    int insertSelective(CommonDistrict record);

    List<CommonDistrict> selectByExample(CommonDistrictExample example);

    CommonDistrict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonDistrict record, @Param("example") CommonDistrictExample example);

    int updateByExample(@Param("record") CommonDistrict record, @Param("example") CommonDistrictExample example);

    int updateByPrimaryKeySelective(CommonDistrict record);

    int updateByPrimaryKey(CommonDistrict record);
}
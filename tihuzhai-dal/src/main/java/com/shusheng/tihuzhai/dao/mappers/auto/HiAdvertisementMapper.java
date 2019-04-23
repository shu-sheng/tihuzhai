package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiAdvertisement;
import com.shusheng.tihuzhai.dao.entity.auto.HiAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiAdvertisementMapper {
    int countByExample(HiAdvertisementExample example);

    int deleteByExample(HiAdvertisementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiAdvertisement record);

    int insertSelective(HiAdvertisement record);

    List<HiAdvertisement> selectByExample(HiAdvertisementExample example);

    HiAdvertisement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiAdvertisement record, @Param("example") HiAdvertisementExample example);

    int updateByExample(@Param("record") HiAdvertisement record, @Param("example") HiAdvertisementExample example);

    int updateByPrimaryKeySelective(HiAdvertisement record);

    int updateByPrimaryKey(HiAdvertisement record);
}
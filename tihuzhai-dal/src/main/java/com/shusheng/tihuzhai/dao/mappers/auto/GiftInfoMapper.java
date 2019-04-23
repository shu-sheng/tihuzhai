package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.GiftInfo;
import com.shusheng.tihuzhai.dao.entity.auto.GiftInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftInfoMapper {
    int countByExample(GiftInfoExample example);

    int deleteByExample(GiftInfoExample example);

    int deleteByPrimaryKey(Long tblBaseId);

    int insert(GiftInfo record);

    int insertSelective(GiftInfo record);

    List<GiftInfo> selectByExample(GiftInfoExample example);

    GiftInfo selectByPrimaryKey(Long tblBaseId);

    int updateByExampleSelective(@Param("record") GiftInfo record, @Param("example") GiftInfoExample example);

    int updateByExample(@Param("record") GiftInfo record, @Param("example") GiftInfoExample example);

    int updateByPrimaryKeySelective(GiftInfo record);

    int updateByPrimaryKey(GiftInfo record);
}
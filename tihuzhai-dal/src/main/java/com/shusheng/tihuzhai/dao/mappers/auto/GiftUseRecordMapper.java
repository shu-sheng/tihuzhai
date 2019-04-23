package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.GiftUseRecord;
import com.shusheng.tihuzhai.dao.entity.auto.GiftUseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftUseRecordMapper {
    int countByExample(GiftUseRecordExample example);

    int deleteByExample(GiftUseRecordExample example);

    int deleteByPrimaryKey(Long tblBaseId);

    int insert(GiftUseRecord record);

    int insertSelective(GiftUseRecord record);

    List<GiftUseRecord> selectByExample(GiftUseRecordExample example);

    GiftUseRecord selectByPrimaryKey(Long tblBaseId);

    int updateByExampleSelective(@Param("record") GiftUseRecord record, @Param("example") GiftUseRecordExample example);

    int updateByExample(@Param("record") GiftUseRecord record, @Param("example") GiftUseRecordExample example);

    int updateByPrimaryKeySelective(GiftUseRecord record);

    int updateByPrimaryKey(GiftUseRecord record);
}
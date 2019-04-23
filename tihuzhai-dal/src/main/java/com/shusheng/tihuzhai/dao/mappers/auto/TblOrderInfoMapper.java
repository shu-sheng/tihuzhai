package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblOrderInfo;
import com.shusheng.tihuzhai.dao.entity.auto.TblOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOrderInfoMapper {
    int countByExample(TblOrderInfoExample example);

    int deleteByExample(TblOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblOrderInfo record);

    int insertSelective(TblOrderInfo record);

    List<TblOrderInfo> selectByExample(TblOrderInfoExample example);

    TblOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblOrderInfo record, @Param("example") TblOrderInfoExample example);

    int updateByExample(@Param("record") TblOrderInfo record, @Param("example") TblOrderInfoExample example);

    int updateByPrimaryKeySelective(TblOrderInfo record);

    int updateByPrimaryKey(TblOrderInfo record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblDrawerAddress;
import com.shusheng.tihuzhai.dao.entity.auto.TblDrawerAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDrawerAddressMapper {
    int countByExample(TblDrawerAddressExample example);

    int deleteByExample(TblDrawerAddressExample example);

    int deleteByPrimaryKey(String id);

    int insert(TblDrawerAddress record);

    int insertSelective(TblDrawerAddress record);

    List<TblDrawerAddress> selectByExample(TblDrawerAddressExample example);

    TblDrawerAddress selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TblDrawerAddress record, @Param("example") TblDrawerAddressExample example);

    int updateByExample(@Param("record") TblDrawerAddress record, @Param("example") TblDrawerAddressExample example);

    int updateByPrimaryKeySelective(TblDrawerAddress record);

    int updateByPrimaryKey(TblDrawerAddress record);
}
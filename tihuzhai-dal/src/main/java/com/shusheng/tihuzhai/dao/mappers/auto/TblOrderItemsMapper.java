package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblOrderItems;
import com.shusheng.tihuzhai.dao.entity.auto.TblOrderItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOrderItemsMapper {
    int countByExample(TblOrderItemsExample example);

    int deleteByExample(TblOrderItemsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblOrderItems record);

    int insertSelective(TblOrderItems record);

    List<TblOrderItems> selectByExample(TblOrderItemsExample example);

    TblOrderItems selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblOrderItems record, @Param("example") TblOrderItemsExample example);

    int updateByExample(@Param("record") TblOrderItems record, @Param("example") TblOrderItemsExample example);

    int updateByPrimaryKeySelective(TblOrderItems record);

    int updateByPrimaryKey(TblOrderItems record);
}
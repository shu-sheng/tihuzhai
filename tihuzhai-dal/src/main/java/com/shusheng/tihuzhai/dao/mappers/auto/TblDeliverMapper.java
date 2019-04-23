package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblDeliver;
import com.shusheng.tihuzhai.dao.entity.auto.TblDeliverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDeliverMapper {
    int countByExample(TblDeliverExample example);

    int deleteByExample(TblDeliverExample example);

    int deleteByPrimaryKey(Long deliverId);

    int insert(TblDeliver record);

    int insertSelective(TblDeliver record);

    List<TblDeliver> selectByExample(TblDeliverExample example);

    TblDeliver selectByPrimaryKey(Long deliverId);

    int updateByExampleSelective(@Param("record") TblDeliver record, @Param("example") TblDeliverExample example);

    int updateByExample(@Param("record") TblDeliver record, @Param("example") TblDeliverExample example);

    int updateByPrimaryKeySelective(TblDeliver record);

    int updateByPrimaryKey(TblDeliver record);
}
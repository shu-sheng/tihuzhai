package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PointsGoodsDetail;
import com.shusheng.tihuzhai.dao.entity.auto.PointsGoodsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointsGoodsDetailMapper {
    int countByExample(PointsGoodsDetailExample example);

    int deleteByExample(PointsGoodsDetailExample example);

    int deleteByPrimaryKey(Long pointsGoodsId);

    int insert(PointsGoodsDetail record);

    int insertSelective(PointsGoodsDetail record);

    List<PointsGoodsDetail> selectByExample(PointsGoodsDetailExample example);

    PointsGoodsDetail selectByPrimaryKey(Long pointsGoodsId);

    int updateByExampleSelective(@Param("record") PointsGoodsDetail record, @Param("example") PointsGoodsDetailExample example);

    int updateByExample(@Param("record") PointsGoodsDetail record, @Param("example") PointsGoodsDetailExample example);

    int updateByPrimaryKeySelective(PointsGoodsDetail record);

    int updateByPrimaryKey(PointsGoodsDetail record);
}
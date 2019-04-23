package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiQaBestBuyDetail;
import com.shusheng.tihuzhai.dao.entity.auto.HiQaBestBuyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiQaBestBuyDetailMapper {
    int countByExample(HiQaBestBuyDetailExample example);

    int deleteByExample(HiQaBestBuyDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiQaBestBuyDetail record);

    int insertSelective(HiQaBestBuyDetail record);

    List<HiQaBestBuyDetail> selectByExample(HiQaBestBuyDetailExample example);

    HiQaBestBuyDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiQaBestBuyDetail record, @Param("example") HiQaBestBuyDetailExample example);

    int updateByExample(@Param("record") HiQaBestBuyDetail record, @Param("example") HiQaBestBuyDetailExample example);

    int updateByPrimaryKeySelective(HiQaBestBuyDetail record);

    int updateByPrimaryKey(HiQaBestBuyDetail record);
}
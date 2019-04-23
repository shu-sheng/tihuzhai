package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblTradeReview;
import com.shusheng.tihuzhai.dao.entity.auto.TblTradeReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblTradeReviewMapper {
    int countByExample(TblTradeReviewExample example);

    int deleteByExample(TblTradeReviewExample example);

    int deleteByPrimaryKey(Long reviewId);

    int insert(TblTradeReview record);

    int insertSelective(TblTradeReview record);

    List<TblTradeReview> selectByExample(TblTradeReviewExample example);

    TblTradeReview selectByPrimaryKey(Long reviewId);

    int updateByExampleSelective(@Param("record") TblTradeReview record, @Param("example") TblTradeReviewExample example);

    int updateByExample(@Param("record") TblTradeReview record, @Param("example") TblTradeReviewExample example);

    int updateByPrimaryKeySelective(TblTradeReview record);

    int updateByPrimaryKey(TblTradeReview record);
}
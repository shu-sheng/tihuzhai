package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblProductRecommend;
import com.shusheng.tihuzhai.dao.entity.auto.TblProductRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblProductRecommendMapper {
    int countByExample(TblProductRecommendExample example);

    int deleteByExample(TblProductRecommendExample example);

    int deleteByPrimaryKey(Long productRecommendId);

    int insert(TblProductRecommend record);

    int insertSelective(TblProductRecommend record);

    List<TblProductRecommend> selectByExample(TblProductRecommendExample example);

    TblProductRecommend selectByPrimaryKey(Long productRecommendId);

    int updateByExampleSelective(@Param("record") TblProductRecommend record, @Param("example") TblProductRecommendExample example);

    int updateByExample(@Param("record") TblProductRecommend record, @Param("example") TblProductRecommendExample example);

    int updateByPrimaryKeySelective(TblProductRecommend record);

    int updateByPrimaryKey(TblProductRecommend record);
}
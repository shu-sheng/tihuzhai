package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblProductLike;
import com.shusheng.tihuzhai.dao.entity.auto.TblProductLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblProductLikeMapper {
    int countByExample(TblProductLikeExample example);

    int deleteByExample(TblProductLikeExample example);

    int deleteByPrimaryKey(Long productLikeId);

    int insert(TblProductLike record);

    int insertSelective(TblProductLike record);

    List<TblProductLike> selectByExample(TblProductLikeExample example);

    TblProductLike selectByPrimaryKey(Long productLikeId);

    int updateByExampleSelective(@Param("record") TblProductLike record, @Param("example") TblProductLikeExample example);

    int updateByExample(@Param("record") TblProductLike record, @Param("example") TblProductLikeExample example);

    int updateByPrimaryKeySelective(TblProductLike record);

    int updateByPrimaryKey(TblProductLike record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PopInfoLike;
import com.shusheng.tihuzhai.dao.entity.auto.PopInfoLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PopInfoLikeMapper {
    int countByExample(PopInfoLikeExample example);

    int deleteByExample(PopInfoLikeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PopInfoLike record);

    int insertSelective(PopInfoLike record);

    List<PopInfoLike> selectByExample(PopInfoLikeExample example);

    PopInfoLike selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PopInfoLike record, @Param("example") PopInfoLikeExample example);

    int updateByExample(@Param("record") PopInfoLike record, @Param("example") PopInfoLikeExample example);

    int updateByPrimaryKeySelective(PopInfoLike record);

    int updateByPrimaryKey(PopInfoLike record);
}
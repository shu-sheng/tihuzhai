package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.FeedbackInfo;
import com.shusheng.tihuzhai.dao.entity.auto.FeedbackInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackInfoMapper {
    int countByExample(FeedbackInfoExample example);

    int deleteByExample(FeedbackInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FeedbackInfo record);

    int insertSelective(FeedbackInfo record);

    List<FeedbackInfo> selectByExample(FeedbackInfoExample example);

    FeedbackInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FeedbackInfo record, @Param("example") FeedbackInfoExample example);

    int updateByExample(@Param("record") FeedbackInfo record, @Param("example") FeedbackInfoExample example);

    int updateByPrimaryKeySelective(FeedbackInfo record);

    int updateByPrimaryKey(FeedbackInfo record);
}
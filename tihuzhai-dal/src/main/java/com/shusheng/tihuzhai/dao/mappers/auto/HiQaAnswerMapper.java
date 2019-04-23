package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiQaAnswer;
import com.shusheng.tihuzhai.dao.entity.auto.HiQaAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiQaAnswerMapper {
    int countByExample(HiQaAnswerExample example);

    int deleteByExample(HiQaAnswerExample example);

    int deleteByPrimaryKey(Long answerId);

    int insert(HiQaAnswer record);

    int insertSelective(HiQaAnswer record);

    List<HiQaAnswer> selectByExample(HiQaAnswerExample example);

    HiQaAnswer selectByPrimaryKey(Long answerId);

    int updateByExampleSelective(@Param("record") HiQaAnswer record, @Param("example") HiQaAnswerExample example);

    int updateByExample(@Param("record") HiQaAnswer record, @Param("example") HiQaAnswerExample example);

    int updateByPrimaryKeySelective(HiQaAnswer record);

    int updateByPrimaryKey(HiQaAnswer record);
}
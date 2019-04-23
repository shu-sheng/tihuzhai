package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiQaQuestion;
import com.shusheng.tihuzhai.dao.entity.auto.HiQaQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiQaQuestionMapper {
    int countByExample(HiQaQuestionExample example);

    int deleteByExample(HiQaQuestionExample example);

    int deleteByPrimaryKey(Long questionId);

    int insert(HiQaQuestion record);

    int insertSelective(HiQaQuestion record);

    List<HiQaQuestion> selectByExample(HiQaQuestionExample example);

    HiQaQuestion selectByPrimaryKey(Long questionId);

    int updateByExampleSelective(@Param("record") HiQaQuestion record, @Param("example") HiQaQuestionExample example);

    int updateByExample(@Param("record") HiQaQuestion record, @Param("example") HiQaQuestionExample example);

    int updateByPrimaryKeySelective(HiQaQuestion record);

    int updateByPrimaryKey(HiQaQuestion record);
}
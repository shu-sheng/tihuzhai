package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTestingQuestion;
import com.shusheng.tihuzhai.dao.entity.auto.HiTestingQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTestingQuestionMapper {
    int countByExample(HiTestingQuestionExample example);

    int deleteByExample(HiTestingQuestionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTestingQuestion record);

    int insertSelective(HiTestingQuestion record);

    List<HiTestingQuestion> selectByExample(HiTestingQuestionExample example);

    HiTestingQuestion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTestingQuestion record, @Param("example") HiTestingQuestionExample example);

    int updateByExample(@Param("record") HiTestingQuestion record, @Param("example") HiTestingQuestionExample example);

    int updateByPrimaryKeySelective(HiTestingQuestion record);

    int updateByPrimaryKey(HiTestingQuestion record);
}
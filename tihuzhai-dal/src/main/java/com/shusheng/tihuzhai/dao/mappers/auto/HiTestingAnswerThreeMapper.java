package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTestingAnswerThree;
import com.shusheng.tihuzhai.dao.entity.auto.HiTestingAnswerThreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTestingAnswerThreeMapper {
    int countByExample(HiTestingAnswerThreeExample example);

    int deleteByExample(HiTestingAnswerThreeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTestingAnswerThree record);

    int insertSelective(HiTestingAnswerThree record);

    List<HiTestingAnswerThree> selectByExample(HiTestingAnswerThreeExample example);

    HiTestingAnswerThree selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTestingAnswerThree record, @Param("example") HiTestingAnswerThreeExample example);

    int updateByExample(@Param("record") HiTestingAnswerThree record, @Param("example") HiTestingAnswerThreeExample example);

    int updateByPrimaryKeySelective(HiTestingAnswerThree record);

    int updateByPrimaryKey(HiTestingAnswerThree record);
}
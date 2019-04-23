package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTestingAnswerTwo;
import com.shusheng.tihuzhai.dao.entity.auto.HiTestingAnswerTwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTestingAnswerTwoMapper {
    int countByExample(HiTestingAnswerTwoExample example);

    int deleteByExample(HiTestingAnswerTwoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTestingAnswerTwo record);

    int insertSelective(HiTestingAnswerTwo record);

    List<HiTestingAnswerTwo> selectByExample(HiTestingAnswerTwoExample example);

    HiTestingAnswerTwo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTestingAnswerTwo record, @Param("example") HiTestingAnswerTwoExample example);

    int updateByExample(@Param("record") HiTestingAnswerTwo record, @Param("example") HiTestingAnswerTwoExample example);

    int updateByPrimaryKeySelective(HiTestingAnswerTwo record);

    int updateByPrimaryKey(HiTestingAnswerTwo record);
}
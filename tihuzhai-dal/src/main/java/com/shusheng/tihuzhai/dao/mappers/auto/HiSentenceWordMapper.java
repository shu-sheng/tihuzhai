package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiSentenceWord;
import com.shusheng.tihuzhai.dao.entity.auto.HiSentenceWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiSentenceWordMapper {
    int countByExample(HiSentenceWordExample example);

    int deleteByExample(HiSentenceWordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiSentenceWord record);

    int insertSelective(HiSentenceWord record);

    List<HiSentenceWord> selectByExample(HiSentenceWordExample example);

    HiSentenceWord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiSentenceWord record, @Param("example") HiSentenceWordExample example);

    int updateByExample(@Param("record") HiSentenceWord record, @Param("example") HiSentenceWordExample example);

    int updateByPrimaryKeySelective(HiSentenceWord record);

    int updateByPrimaryKey(HiSentenceWord record);
}
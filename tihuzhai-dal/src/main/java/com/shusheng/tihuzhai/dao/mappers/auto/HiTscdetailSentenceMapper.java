package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTscdetailSentence;
import com.shusheng.tihuzhai.dao.entity.auto.HiTscdetailSentenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTscdetailSentenceMapper {
    int countByExample(HiTscdetailSentenceExample example);

    int deleteByExample(HiTscdetailSentenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTscdetailSentence record);

    int insertSelective(HiTscdetailSentence record);

    List<HiTscdetailSentence> selectByExample(HiTscdetailSentenceExample example);

    HiTscdetailSentence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTscdetailSentence record, @Param("example") HiTscdetailSentenceExample example);

    int updateByExample(@Param("record") HiTscdetailSentence record, @Param("example") HiTscdetailSentenceExample example);

    int updateByPrimaryKeySelective(HiTscdetailSentence record);

    int updateByPrimaryKey(HiTscdetailSentence record);
}
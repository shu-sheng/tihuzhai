package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiChineseSentence;
import com.shusheng.tihuzhai.dao.entity.auto.HiChineseSentenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiChineseSentenceMapper {
    int countByExample(HiChineseSentenceExample example);

    int deleteByExample(HiChineseSentenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiChineseSentence record);

    int insertSelective(HiChineseSentence record);

    List<HiChineseSentence> selectByExample(HiChineseSentenceExample example);

    HiChineseSentence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiChineseSentence record, @Param("example") HiChineseSentenceExample example);

    int updateByExample(@Param("record") HiChineseSentence record, @Param("example") HiChineseSentenceExample example);

    int updateByPrimaryKeySelective(HiChineseSentence record);

    int updateByPrimaryKey(HiChineseSentence record);
}
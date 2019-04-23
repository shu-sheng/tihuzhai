package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiDialogueSentence;
import com.shusheng.tihuzhai.dao.entity.auto.HiDialogueSentenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiDialogueSentenceMapper {
    int countByExample(HiDialogueSentenceExample example);

    int deleteByExample(HiDialogueSentenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiDialogueSentence record);

    int insertSelective(HiDialogueSentence record);

    List<HiDialogueSentence> selectByExample(HiDialogueSentenceExample example);

    HiDialogueSentence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiDialogueSentence record, @Param("example") HiDialogueSentenceExample example);

    int updateByExample(@Param("record") HiDialogueSentence record, @Param("example") HiDialogueSentenceExample example);

    int updateByPrimaryKeySelective(HiDialogueSentence record);

    int updateByPrimaryKey(HiDialogueSentence record);
}
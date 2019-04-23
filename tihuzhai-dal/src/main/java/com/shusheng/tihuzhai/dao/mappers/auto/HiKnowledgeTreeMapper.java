package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiKnowledgeTree;
import com.shusheng.tihuzhai.dao.entity.auto.HiKnowledgeTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiKnowledgeTreeMapper {
    int countByExample(HiKnowledgeTreeExample example);

    int deleteByExample(HiKnowledgeTreeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiKnowledgeTree record);

    int insertSelective(HiKnowledgeTree record);

    List<HiKnowledgeTree> selectByExample(HiKnowledgeTreeExample example);

    HiKnowledgeTree selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiKnowledgeTree record, @Param("example") HiKnowledgeTreeExample example);

    int updateByExample(@Param("record") HiKnowledgeTree record, @Param("example") HiKnowledgeTreeExample example);

    int updateByPrimaryKeySelective(HiKnowledgeTree record);

    int updateByPrimaryKey(HiKnowledgeTree record);
}
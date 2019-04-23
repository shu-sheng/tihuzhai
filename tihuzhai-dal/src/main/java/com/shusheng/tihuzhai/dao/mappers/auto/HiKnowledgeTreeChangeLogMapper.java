package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiKnowledgeTreeChangeLog;
import com.shusheng.tihuzhai.dao.entity.auto.HiKnowledgeTreeChangeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiKnowledgeTreeChangeLogMapper {
    int countByExample(HiKnowledgeTreeChangeLogExample example);

    int deleteByExample(HiKnowledgeTreeChangeLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiKnowledgeTreeChangeLog record);

    int insertSelective(HiKnowledgeTreeChangeLog record);

    List<HiKnowledgeTreeChangeLog> selectByExample(HiKnowledgeTreeChangeLogExample example);

    HiKnowledgeTreeChangeLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiKnowledgeTreeChangeLog record, @Param("example") HiKnowledgeTreeChangeLogExample example);

    int updateByExample(@Param("record") HiKnowledgeTreeChangeLog record, @Param("example") HiKnowledgeTreeChangeLogExample example);

    int updateByPrimaryKeySelective(HiKnowledgeTreeChangeLog record);

    int updateByPrimaryKey(HiKnowledgeTreeChangeLog record);
}
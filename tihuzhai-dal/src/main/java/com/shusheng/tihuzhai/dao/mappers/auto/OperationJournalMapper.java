package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.OperationJournal;
import com.shusheng.tihuzhai.dao.entity.auto.OperationJournalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationJournalMapper {
    int countByExample(OperationJournalExample example);

    int deleteByExample(OperationJournalExample example);

    int deleteByPrimaryKey(Long identity);

    int insert(OperationJournal record);

    int insertSelective(OperationJournal record);

    List<OperationJournal> selectByExample(OperationJournalExample example);

    OperationJournal selectByPrimaryKey(Long identity);

    int updateByExampleSelective(@Param("record") OperationJournal record, @Param("example") OperationJournalExample example);

    int updateByExample(@Param("record") OperationJournal record, @Param("example") OperationJournalExample example);

    int updateByPrimaryKeySelective(OperationJournal record);

    int updateByPrimaryKey(OperationJournal record);
}
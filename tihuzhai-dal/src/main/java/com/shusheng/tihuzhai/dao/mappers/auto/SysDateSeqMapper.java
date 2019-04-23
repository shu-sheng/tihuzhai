package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.SysDateSeq;
import com.shusheng.tihuzhai.dao.entity.auto.SysDateSeqExample;
import com.shusheng.tihuzhai.dao.entity.auto.SysDateSeqKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDateSeqMapper {
    int countByExample(SysDateSeqExample example);

    int deleteByExample(SysDateSeqExample example);

    int deleteByPrimaryKey(SysDateSeqKey key);

    int insert(SysDateSeq record);

    int insertSelective(SysDateSeq record);

    List<SysDateSeq> selectByExample(SysDateSeqExample example);

    SysDateSeq selectByPrimaryKey(SysDateSeqKey key);

    int updateByExampleSelective(@Param("record") SysDateSeq record, @Param("example") SysDateSeqExample example);

    int updateByExample(@Param("record") SysDateSeq record, @Param("example") SysDateSeqExample example);

    int updateByPrimaryKeySelective(SysDateSeq record);

    int updateByPrimaryKey(SysDateSeq record);
}
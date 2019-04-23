package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiVideo;
import com.shusheng.tihuzhai.dao.entity.auto.HiVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiVideoMapper {
    int countByExample(HiVideoExample example);

    int deleteByExample(HiVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiVideo record);

    int insertSelective(HiVideo record);

    List<HiVideo> selectByExample(HiVideoExample example);

    HiVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiVideo record, @Param("example") HiVideoExample example);

    int updateByExample(@Param("record") HiVideo record, @Param("example") HiVideoExample example);

    int updateByPrimaryKeySelective(HiVideo record);

    int updateByPrimaryKey(HiVideo record);
}
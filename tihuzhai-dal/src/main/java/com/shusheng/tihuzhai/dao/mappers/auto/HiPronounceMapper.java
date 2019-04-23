package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiPronounce;
import com.shusheng.tihuzhai.dao.entity.auto.HiPronounceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiPronounceMapper {
    int countByExample(HiPronounceExample example);

    int deleteByExample(HiPronounceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiPronounce record);

    int insertSelective(HiPronounce record);

    List<HiPronounce> selectByExample(HiPronounceExample example);

    HiPronounce selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiPronounce record, @Param("example") HiPronounceExample example);

    int updateByExample(@Param("record") HiPronounce record, @Param("example") HiPronounceExample example);

    int updateByPrimaryKeySelective(HiPronounce record);

    int updateByPrimaryKey(HiPronounce record);
}
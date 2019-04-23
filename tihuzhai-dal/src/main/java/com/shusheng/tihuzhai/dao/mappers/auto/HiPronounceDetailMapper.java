package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiPronounceDetail;
import com.shusheng.tihuzhai.dao.entity.auto.HiPronounceDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiPronounceDetailMapper {
    int countByExample(HiPronounceDetailExample example);

    int deleteByExample(HiPronounceDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiPronounceDetail record);

    int insertSelective(HiPronounceDetail record);

    List<HiPronounceDetail> selectByExample(HiPronounceDetailExample example);

    HiPronounceDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiPronounceDetail record, @Param("example") HiPronounceDetailExample example);

    int updateByExample(@Param("record") HiPronounceDetail record, @Param("example") HiPronounceDetailExample example);

    int updateByPrimaryKeySelective(HiPronounceDetail record);

    int updateByPrimaryKey(HiPronounceDetail record);
}
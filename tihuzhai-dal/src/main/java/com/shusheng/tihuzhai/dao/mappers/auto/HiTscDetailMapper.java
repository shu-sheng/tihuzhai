package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTscDetail;
import com.shusheng.tihuzhai.dao.entity.auto.HiTscDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTscDetailMapper {
    int countByExample(HiTscDetailExample example);

    int deleteByExample(HiTscDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTscDetail record);

    int insertSelective(HiTscDetail record);

    List<HiTscDetail> selectByExample(HiTscDetailExample example);

    HiTscDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTscDetail record, @Param("example") HiTscDetailExample example);

    int updateByExample(@Param("record") HiTscDetail record, @Param("example") HiTscDetailExample example);

    int updateByPrimaryKeySelective(HiTscDetail record);

    int updateByPrimaryKey(HiTscDetail record);
}
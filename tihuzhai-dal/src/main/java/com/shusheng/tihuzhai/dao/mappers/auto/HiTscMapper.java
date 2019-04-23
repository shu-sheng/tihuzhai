package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTsc;
import com.shusheng.tihuzhai.dao.entity.auto.HiTscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTscMapper {
    int countByExample(HiTscExample example);

    int deleteByExample(HiTscExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTsc record);

    int insertSelective(HiTsc record);

    List<HiTsc> selectByExample(HiTscExample example);

    HiTsc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTsc record, @Param("example") HiTscExample example);

    int updateByExample(@Param("record") HiTsc record, @Param("example") HiTscExample example);

    int updateByPrimaryKeySelective(HiTsc record);

    int updateByPrimaryKey(HiTsc record);
}
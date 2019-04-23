package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiLabel;
import com.shusheng.tihuzhai.dao.entity.auto.HiLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiLabelMapper {
    int countByExample(HiLabelExample example);

    int deleteByExample(HiLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiLabel record);

    int insertSelective(HiLabel record);

    List<HiLabel> selectByExample(HiLabelExample example);

    HiLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiLabel record, @Param("example") HiLabelExample example);

    int updateByExample(@Param("record") HiLabel record, @Param("example") HiLabelExample example);

    int updateByPrimaryKeySelective(HiLabel record);

    int updateByPrimaryKey(HiLabel record);
}
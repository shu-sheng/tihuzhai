package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcMenu;
import com.shusheng.tihuzhai.dao.entity.auto.AcMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcMenuMapper {
    int countByExample(AcMenuExample example);

    int deleteByExample(AcMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcMenu record);

    int insertSelective(AcMenu record);

    List<AcMenu> selectByExample(AcMenuExample example);

    AcMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcMenu record, @Param("example") AcMenuExample example);

    int updateByExample(@Param("record") AcMenu record, @Param("example") AcMenuExample example);

    int updateByPrimaryKeySelective(AcMenu record);

    int updateByPrimaryKey(AcMenu record);
}
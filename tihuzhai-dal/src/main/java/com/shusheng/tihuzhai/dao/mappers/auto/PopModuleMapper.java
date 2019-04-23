package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PopModule;
import com.shusheng.tihuzhai.dao.entity.auto.PopModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PopModuleMapper {
    int countByExample(PopModuleExample example);

    int deleteByExample(PopModuleExample example);

    int deleteByPrimaryKey(Long moduleId);

    int insert(PopModule record);

    int insertSelective(PopModule record);

    List<PopModule> selectByExample(PopModuleExample example);

    PopModule selectByPrimaryKey(Long moduleId);

    int updateByExampleSelective(@Param("record") PopModule record, @Param("example") PopModuleExample example);

    int updateByExample(@Param("record") PopModule record, @Param("example") PopModuleExample example);

    int updateByPrimaryKeySelective(PopModule record);

    int updateByPrimaryKey(PopModule record);
}
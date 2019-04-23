package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblLogistics;
import com.shusheng.tihuzhai.dao.entity.auto.TblLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblLogisticsMapper {
    int countByExample(TblLogisticsExample example);

    int deleteByExample(TblLogisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblLogistics record);

    int insertSelective(TblLogistics record);

    List<TblLogistics> selectByExample(TblLogisticsExample example);

    TblLogistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblLogistics record, @Param("example") TblLogisticsExample example);

    int updateByExample(@Param("record") TblLogistics record, @Param("example") TblLogisticsExample example);

    int updateByPrimaryKeySelective(TblLogistics record);

    int updateByPrimaryKey(TblLogistics record);
}
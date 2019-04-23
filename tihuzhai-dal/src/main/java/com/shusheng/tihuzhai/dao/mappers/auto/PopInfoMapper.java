package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PopInfo;
import com.shusheng.tihuzhai.dao.entity.auto.PopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PopInfoMapper {
    int countByExample(PopInfoExample example);

    int deleteByExample(PopInfoExample example);

    int deleteByPrimaryKey(Long baseId);

    int insert(PopInfo record);

    int insertSelective(PopInfo record);

    List<PopInfo> selectByExampleWithBLOBs(PopInfoExample example);

    List<PopInfo> selectByExample(PopInfoExample example);

    PopInfo selectByPrimaryKey(Long baseId);

    int updateByExampleSelective(@Param("record") PopInfo record, @Param("example") PopInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PopInfo record, @Param("example") PopInfoExample example);

    int updateByExample(@Param("record") PopInfo record, @Param("example") PopInfoExample example);

    int updateByPrimaryKeySelective(PopInfo record);

    int updateByPrimaryKeyWithBLOBs(PopInfo record);

    int updateByPrimaryKey(PopInfo record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblProductType;
import com.shusheng.tihuzhai.dao.entity.auto.TblProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblProductTypeMapper {
    int countByExample(TblProductTypeExample example);

    int deleteByExample(TblProductTypeExample example);

    int deleteByPrimaryKey(Long ptId);

    int insert(TblProductType record);

    int insertSelective(TblProductType record);

    List<TblProductType> selectByExample(TblProductTypeExample example);

    TblProductType selectByPrimaryKey(Long ptId);

    int updateByExampleSelective(@Param("record") TblProductType record, @Param("example") TblProductTypeExample example);

    int updateByExample(@Param("record") TblProductType record, @Param("example") TblProductTypeExample example);

    int updateByPrimaryKeySelective(TblProductType record);

    int updateByPrimaryKey(TblProductType record);
}
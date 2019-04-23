package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTeachingMaterialType;
import com.shusheng.tihuzhai.dao.entity.auto.HiTeachingMaterialTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTeachingMaterialTypeMapper {
    int countByExample(HiTeachingMaterialTypeExample example);

    int deleteByExample(HiTeachingMaterialTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTeachingMaterialType record);

    int insertSelective(HiTeachingMaterialType record);

    List<HiTeachingMaterialType> selectByExample(HiTeachingMaterialTypeExample example);

    HiTeachingMaterialType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTeachingMaterialType record, @Param("example") HiTeachingMaterialTypeExample example);

    int updateByExample(@Param("record") HiTeachingMaterialType record, @Param("example") HiTeachingMaterialTypeExample example);

    int updateByPrimaryKeySelective(HiTeachingMaterialType record);

    int updateByPrimaryKey(HiTeachingMaterialType record);
}
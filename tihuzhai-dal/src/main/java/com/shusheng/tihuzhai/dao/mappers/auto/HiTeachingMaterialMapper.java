package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTeachingMaterial;
import com.shusheng.tihuzhai.dao.entity.auto.HiTeachingMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTeachingMaterialMapper {
    int countByExample(HiTeachingMaterialExample example);

    int deleteByExample(HiTeachingMaterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTeachingMaterial record);

    int insertSelective(HiTeachingMaterial record);

    List<HiTeachingMaterial> selectByExample(HiTeachingMaterialExample example);

    HiTeachingMaterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTeachingMaterial record, @Param("example") HiTeachingMaterialExample example);

    int updateByExample(@Param("record") HiTeachingMaterial record, @Param("example") HiTeachingMaterialExample example);

    int updateByPrimaryKeySelective(HiTeachingMaterial record);

    int updateByPrimaryKey(HiTeachingMaterial record);
}
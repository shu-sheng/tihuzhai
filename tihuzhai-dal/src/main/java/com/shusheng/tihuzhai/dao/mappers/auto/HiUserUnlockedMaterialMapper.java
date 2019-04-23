package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiUserUnlockedMaterial;
import com.shusheng.tihuzhai.dao.entity.auto.HiUserUnlockedMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiUserUnlockedMaterialMapper {
    int countByExample(HiUserUnlockedMaterialExample example);

    int deleteByExample(HiUserUnlockedMaterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiUserUnlockedMaterial record);

    int insertSelective(HiUserUnlockedMaterial record);

    List<HiUserUnlockedMaterial> selectByExample(HiUserUnlockedMaterialExample example);

    HiUserUnlockedMaterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiUserUnlockedMaterial record, @Param("example") HiUserUnlockedMaterialExample example);

    int updateByExample(@Param("record") HiUserUnlockedMaterial record, @Param("example") HiUserUnlockedMaterialExample example);

    int updateByPrimaryKeySelective(HiUserUnlockedMaterial record);

    int updateByPrimaryKey(HiUserUnlockedMaterial record);
}
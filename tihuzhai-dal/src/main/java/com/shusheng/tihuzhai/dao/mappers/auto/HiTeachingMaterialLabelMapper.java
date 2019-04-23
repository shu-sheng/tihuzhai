package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTeachingMaterialLabel;
import com.shusheng.tihuzhai.dao.entity.auto.HiTeachingMaterialLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTeachingMaterialLabelMapper {
    int countByExample(HiTeachingMaterialLabelExample example);

    int deleteByExample(HiTeachingMaterialLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTeachingMaterialLabel record);

    int insertSelective(HiTeachingMaterialLabel record);

    List<HiTeachingMaterialLabel> selectByExample(HiTeachingMaterialLabelExample example);

    HiTeachingMaterialLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTeachingMaterialLabel record, @Param("example") HiTeachingMaterialLabelExample example);

    int updateByExample(@Param("record") HiTeachingMaterialLabel record, @Param("example") HiTeachingMaterialLabelExample example);

    int updateByPrimaryKeySelective(HiTeachingMaterialLabel record);

    int updateByPrimaryKey(HiTeachingMaterialLabel record);
}
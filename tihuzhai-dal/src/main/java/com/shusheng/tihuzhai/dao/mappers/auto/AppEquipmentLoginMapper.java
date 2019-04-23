package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AppEquipmentLogin;
import com.shusheng.tihuzhai.dao.entity.auto.AppEquipmentLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppEquipmentLoginMapper {
    int countByExample(AppEquipmentLoginExample example);

    int deleteByExample(AppEquipmentLoginExample example);

    int deleteByPrimaryKey(String equipmentNo);

    int insert(AppEquipmentLogin record);

    int insertSelective(AppEquipmentLogin record);

    List<AppEquipmentLogin> selectByExample(AppEquipmentLoginExample example);

    AppEquipmentLogin selectByPrimaryKey(String equipmentNo);

    int updateByExampleSelective(@Param("record") AppEquipmentLogin record, @Param("example") AppEquipmentLoginExample example);

    int updateByExample(@Param("record") AppEquipmentLogin record, @Param("example") AppEquipmentLoginExample example);

    int updateByPrimaryKeySelective(AppEquipmentLogin record);

    int updateByPrimaryKey(AppEquipmentLogin record);
}
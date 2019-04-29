package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcRoleMenu;
import com.shusheng.tihuzhai.dao.entity.auto.AcRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcRoleMenuMapper {
    int countByExample(AcRoleMenuExample example);

    int deleteByExample(AcRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcRoleMenu record);

    int insertSelective(AcRoleMenu record);

    List<AcRoleMenu> selectByExample(AcRoleMenuExample example);

    AcRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcRoleMenu record, @Param("example") AcRoleMenuExample example);

    int updateByExample(@Param("record") AcRoleMenu record, @Param("example") AcRoleMenuExample example);

    int updateByPrimaryKeySelective(AcRoleMenu record);

    int updateByPrimaryKey(AcRoleMenu record);
}
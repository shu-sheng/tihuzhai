package com.shusheng.tihuzhai.dao.automappers;

import com.shusheng.tihuzhai.dao.autoentity.AcRoleMenu;
import com.shusheng.tihuzhai.dao.autoentity.AcRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcRoleMenuMapper {
    int countByExample(AcRoleMenuExample example);

    int deleteByExample(AcRoleMenuExample example);

    int insert(AcRoleMenu record);

    int insertSelective(AcRoleMenu record);

    List<AcRoleMenu> selectByExample(AcRoleMenuExample example);

    int updateByExampleSelective(@Param("record") AcRoleMenu record, @Param("example") AcRoleMenuExample example);

    int updateByExample(@Param("record") AcRoleMenu record, @Param("example") AcRoleMenuExample example);
}
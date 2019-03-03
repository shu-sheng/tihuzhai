package com.shusheng.tihuzhai.dao.automappers;

import com.shusheng.tihuzhai.dao.autoentity.AcUserRole;
import com.shusheng.tihuzhai.dao.autoentity.AcUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcUserRoleMapper {
    int countByExample(AcUserRoleExample example);

    int deleteByExample(AcUserRoleExample example);

    int insert(AcUserRole record);

    int insertSelective(AcUserRole record);

    List<AcUserRole> selectByExample(AcUserRoleExample example);

    int updateByExampleSelective(@Param("record") AcUserRole record, @Param("example") AcUserRoleExample example);

    int updateByExample(@Param("record") AcUserRole record, @Param("example") AcUserRoleExample example);
}
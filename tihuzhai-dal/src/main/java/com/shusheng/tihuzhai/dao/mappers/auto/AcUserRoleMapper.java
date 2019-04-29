package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcUserRole;
import com.shusheng.tihuzhai.dao.entity.auto.AcUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcUserRoleMapper {
    int countByExample(AcUserRoleExample example);

    int deleteByExample(AcUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcUserRole record);

    int insertSelective(AcUserRole record);

    List<AcUserRole> selectByExample(AcUserRoleExample example);

    AcUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcUserRole record, @Param("example") AcUserRoleExample example);

    int updateByExample(@Param("record") AcUserRole record, @Param("example") AcUserRoleExample example);

    int updateByPrimaryKeySelective(AcUserRole record);

    int updateByPrimaryKey(AcUserRole record);
}
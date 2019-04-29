package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcRole;
import com.shusheng.tihuzhai.dao.entity.auto.AcRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcRoleMapper {
    int countByExample(AcRoleExample example);

    int deleteByExample(AcRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcRole record);

    int insertSelective(AcRole record);

    List<AcRole> selectByExample(AcRoleExample example);

    AcRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcRole record, @Param("example") AcRoleExample example);

    int updateByExample(@Param("record") AcRole record, @Param("example") AcRoleExample example);

    int updateByPrimaryKeySelective(AcRole record);

    int updateByPrimaryKey(AcRole record);
}
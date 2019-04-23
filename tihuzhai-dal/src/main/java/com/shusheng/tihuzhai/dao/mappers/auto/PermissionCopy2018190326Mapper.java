package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PermissionCopy2018190326;
import com.shusheng.tihuzhai.dao.entity.auto.PermissionCopy2018190326Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionCopy2018190326Mapper {
    int countByExample(PermissionCopy2018190326Example example);

    int deleteByExample(PermissionCopy2018190326Example example);

    int deleteByPrimaryKey(Integer permissionId);

    int insert(PermissionCopy2018190326 record);

    int insertSelective(PermissionCopy2018190326 record);

    List<PermissionCopy2018190326> selectByExample(PermissionCopy2018190326Example example);

    PermissionCopy2018190326 selectByPrimaryKey(Integer permissionId);

    int updateByExampleSelective(@Param("record") PermissionCopy2018190326 record, @Param("example") PermissionCopy2018190326Example example);

    int updateByExample(@Param("record") PermissionCopy2018190326 record, @Param("example") PermissionCopy2018190326Example example);

    int updateByPrimaryKeySelective(PermissionCopy2018190326 record);

    int updateByPrimaryKey(PermissionCopy2018190326 record);
}
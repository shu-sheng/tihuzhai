package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.RoleReport;
import com.shusheng.tihuzhai.dao.entity.auto.RoleReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleReportMapper {
    int countByExample(RoleReportExample example);

    int deleteByExample(RoleReportExample example);

    int deleteByPrimaryKey(Long roleReportId);

    int insert(RoleReport record);

    int insertSelective(RoleReport record);

    List<RoleReport> selectByExample(RoleReportExample example);

    RoleReport selectByPrimaryKey(Long roleReportId);

    int updateByExampleSelective(@Param("record") RoleReport record, @Param("example") RoleReportExample example);

    int updateByExample(@Param("record") RoleReport record, @Param("example") RoleReportExample example);

    int updateByPrimaryKeySelective(RoleReport record);

    int updateByPrimaryKey(RoleReport record);
}
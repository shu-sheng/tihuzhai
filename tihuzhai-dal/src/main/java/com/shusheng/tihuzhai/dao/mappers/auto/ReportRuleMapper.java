package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.ReportRule;
import com.shusheng.tihuzhai.dao.entity.auto.ReportRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportRuleMapper {
    int countByExample(ReportRuleExample example);

    int deleteByExample(ReportRuleExample example);

    int deleteByPrimaryKey(Long reportId);

    int insert(ReportRule record);

    int insertSelective(ReportRule record);

    List<ReportRule> selectByExample(ReportRuleExample example);

    ReportRule selectByPrimaryKey(Long reportId);

    int updateByExampleSelective(@Param("record") ReportRule record, @Param("example") ReportRuleExample example);

    int updateByExample(@Param("record") ReportRule record, @Param("example") ReportRuleExample example);

    int updateByPrimaryKeySelective(ReportRule record);

    int updateByPrimaryKey(ReportRule record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PointsRule;
import com.shusheng.tihuzhai.dao.entity.auto.PointsRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointsRuleMapper {
    int countByExample(PointsRuleExample example);

    int deleteByExample(PointsRuleExample example);

    int deleteByPrimaryKey(Long pointsRuleId);

    int insert(PointsRule record);

    int insertSelective(PointsRule record);

    List<PointsRule> selectByExample(PointsRuleExample example);

    PointsRule selectByPrimaryKey(Long pointsRuleId);

    int updateByExampleSelective(@Param("record") PointsRule record, @Param("example") PointsRuleExample example);

    int updateByExample(@Param("record") PointsRule record, @Param("example") PointsRuleExample example);

    int updateByPrimaryKeySelective(PointsRule record);

    int updateByPrimaryKey(PointsRule record);
}
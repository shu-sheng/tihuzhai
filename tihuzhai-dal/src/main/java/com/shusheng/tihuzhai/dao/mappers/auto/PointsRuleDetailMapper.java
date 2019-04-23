package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PointsRuleDetail;
import com.shusheng.tihuzhai.dao.entity.auto.PointsRuleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointsRuleDetailMapper {
    int countByExample(PointsRuleDetailExample example);

    int deleteByExample(PointsRuleDetailExample example);

    int deleteByPrimaryKey(Long pointsRuleDetailId);

    int insert(PointsRuleDetail record);

    int insertSelective(PointsRuleDetail record);

    List<PointsRuleDetail> selectByExample(PointsRuleDetailExample example);

    PointsRuleDetail selectByPrimaryKey(Long pointsRuleDetailId);

    int updateByExampleSelective(@Param("record") PointsRuleDetail record, @Param("example") PointsRuleDetailExample example);

    int updateByExample(@Param("record") PointsRuleDetail record, @Param("example") PointsRuleDetailExample example);

    int updateByPrimaryKeySelective(PointsRuleDetail record);

    int updateByPrimaryKey(PointsRuleDetail record);
}
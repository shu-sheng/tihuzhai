package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserLevelRule;
import com.shusheng.tihuzhai.dao.entity.auto.UserLevelRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLevelRuleMapper {
    int countByExample(UserLevelRuleExample example);

    int deleteByExample(UserLevelRuleExample example);

    int deleteByPrimaryKey(Long ruleId);

    int insert(UserLevelRule record);

    int insertSelective(UserLevelRule record);

    List<UserLevelRule> selectByExample(UserLevelRuleExample example);

    UserLevelRule selectByPrimaryKey(Long ruleId);

    int updateByExampleSelective(@Param("record") UserLevelRule record, @Param("example") UserLevelRuleExample example);

    int updateByExample(@Param("record") UserLevelRule record, @Param("example") UserLevelRuleExample example);

    int updateByPrimaryKeySelective(UserLevelRule record);

    int updateByPrimaryKey(UserLevelRule record);
}
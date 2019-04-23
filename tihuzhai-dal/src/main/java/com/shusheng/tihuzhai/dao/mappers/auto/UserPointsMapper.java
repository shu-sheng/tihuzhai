package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserPoints;
import com.shusheng.tihuzhai.dao.entity.auto.UserPointsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointsMapper {
    int countByExample(UserPointsExample example);

    int deleteByExample(UserPointsExample example);

    int deleteByPrimaryKey(Long userPointsId);

    int insert(UserPoints record);

    int insertSelective(UserPoints record);

    List<UserPoints> selectByExample(UserPointsExample example);

    UserPoints selectByPrimaryKey(Long userPointsId);

    int updateByExampleSelective(@Param("record") UserPoints record, @Param("example") UserPointsExample example);

    int updateByExample(@Param("record") UserPoints record, @Param("example") UserPointsExample example);

    int updateByPrimaryKeySelective(UserPoints record);

    int updateByPrimaryKey(UserPoints record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserPointsDetail;
import com.shusheng.tihuzhai.dao.entity.auto.UserPointsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointsDetailMapper {
    int countByExample(UserPointsDetailExample example);

    int deleteByExample(UserPointsDetailExample example);

    int deleteByPrimaryKey(Long pointsDetailId);

    int insert(UserPointsDetail record);

    int insertSelective(UserPointsDetail record);

    List<UserPointsDetail> selectByExample(UserPointsDetailExample example);

    UserPointsDetail selectByPrimaryKey(Long pointsDetailId);

    int updateByExampleSelective(@Param("record") UserPointsDetail record, @Param("example") UserPointsDetailExample example);

    int updateByExample(@Param("record") UserPointsDetail record, @Param("example") UserPointsDetailExample example);

    int updateByPrimaryKeySelective(UserPointsDetail record);

    int updateByPrimaryKey(UserPointsDetail record);
}
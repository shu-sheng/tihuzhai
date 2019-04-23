package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserIntegralDetail;
import com.shusheng.tihuzhai.dao.entity.auto.UserIntegralDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIntegralDetailMapper {
    int countByExample(UserIntegralDetailExample example);

    int deleteByExample(UserIntegralDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserIntegralDetail record);

    int insertSelective(UserIntegralDetail record);

    List<UserIntegralDetail> selectByExample(UserIntegralDetailExample example);

    UserIntegralDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserIntegralDetail record, @Param("example") UserIntegralDetailExample example);

    int updateByExample(@Param("record") UserIntegralDetail record, @Param("example") UserIntegralDetailExample example);

    int updateByPrimaryKeySelective(UserIntegralDetail record);

    int updateByPrimaryKey(UserIntegralDetail record);
}
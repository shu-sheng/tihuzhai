package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserInterest;
import com.shusheng.tihuzhai.dao.entity.auto.UserInterestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInterestMapper {
    int countByExample(UserInterestExample example);

    int deleteByExample(UserInterestExample example);

    int deleteByPrimaryKey(Long userInterestId);

    int insert(UserInterest record);

    int insertSelective(UserInterest record);

    List<UserInterest> selectByExample(UserInterestExample example);

    UserInterest selectByPrimaryKey(Long userInterestId);

    int updateByExampleSelective(@Param("record") UserInterest record, @Param("example") UserInterestExample example);

    int updateByExample(@Param("record") UserInterest record, @Param("example") UserInterestExample example);

    int updateByPrimaryKeySelective(UserInterest record);

    int updateByPrimaryKey(UserInterest record);
}
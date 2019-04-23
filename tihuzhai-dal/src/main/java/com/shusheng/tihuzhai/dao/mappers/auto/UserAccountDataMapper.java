package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserAccountData;
import com.shusheng.tihuzhai.dao.entity.auto.UserAccountDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountDataMapper {
    int countByExample(UserAccountDataExample example);

    int deleteByExample(UserAccountDataExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserAccountData record);

    int insertSelective(UserAccountData record);

    List<UserAccountData> selectByExample(UserAccountDataExample example);

    UserAccountData selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserAccountData record, @Param("example") UserAccountDataExample example);

    int updateByExample(@Param("record") UserAccountData record, @Param("example") UserAccountDataExample example);

    int updateByPrimaryKeySelective(UserAccountData record);

    int updateByPrimaryKey(UserAccountData record);
}
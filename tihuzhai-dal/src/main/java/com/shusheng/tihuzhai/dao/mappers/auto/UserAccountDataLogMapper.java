package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserAccountDataLog;
import com.shusheng.tihuzhai.dao.entity.auto.UserAccountDataLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountDataLogMapper {
    int countByExample(UserAccountDataLogExample example);

    int deleteByExample(UserAccountDataLogExample example);

    int deleteByPrimaryKey(Long userAccountDataLogId);

    int insert(UserAccountDataLog record);

    int insertSelective(UserAccountDataLog record);

    List<UserAccountDataLog> selectByExample(UserAccountDataLogExample example);

    UserAccountDataLog selectByPrimaryKey(Long userAccountDataLogId);

    int updateByExampleSelective(@Param("record") UserAccountDataLog record, @Param("example") UserAccountDataLogExample example);

    int updateByExample(@Param("record") UserAccountDataLog record, @Param("example") UserAccountDataLogExample example);

    int updateByPrimaryKeySelective(UserAccountDataLog record);

    int updateByPrimaryKey(UserAccountDataLog record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserName;
import com.shusheng.tihuzhai.dao.entity.auto.UserNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserNameMapper {
    int countByExample(UserNameExample example);

    int deleteByExample(UserNameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserName record);

    int insertSelective(UserName record);

    List<UserName> selectByExample(UserNameExample example);

    UserName selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserName record, @Param("example") UserNameExample example);

    int updateByExample(@Param("record") UserName record, @Param("example") UserNameExample example);

    int updateByPrimaryKeySelective(UserName record);

    int updateByPrimaryKey(UserName record);
}
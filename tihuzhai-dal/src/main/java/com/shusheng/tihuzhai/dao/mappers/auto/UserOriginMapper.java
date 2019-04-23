package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserOrigin;
import com.shusheng.tihuzhai.dao.entity.auto.UserOriginExample;
import com.shusheng.tihuzhai.dao.entity.auto.UserOriginKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOriginMapper {
    int countByExample(UserOriginExample example);

    int deleteByExample(UserOriginExample example);

    int deleteByPrimaryKey(UserOriginKey key);

    int insert(UserOrigin record);

    int insertSelective(UserOrigin record);

    List<UserOrigin> selectByExample(UserOriginExample example);

    UserOrigin selectByPrimaryKey(UserOriginKey key);

    int updateByExampleSelective(@Param("record") UserOrigin record, @Param("example") UserOriginExample example);

    int updateByExample(@Param("record") UserOrigin record, @Param("example") UserOriginExample example);

    int updateByPrimaryKeySelective(UserOrigin record);

    int updateByPrimaryKey(UserOrigin record);
}
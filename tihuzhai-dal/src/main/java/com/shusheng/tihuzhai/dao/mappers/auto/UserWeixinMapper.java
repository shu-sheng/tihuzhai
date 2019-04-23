package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserWeixin;
import com.shusheng.tihuzhai.dao.entity.auto.UserWeixinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeixinMapper {
    int countByExample(UserWeixinExample example);

    int deleteByExample(UserWeixinExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWeixin record);

    int insertSelective(UserWeixin record);

    List<UserWeixin> selectByExample(UserWeixinExample example);

    UserWeixin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWeixin record, @Param("example") UserWeixinExample example);

    int updateByExample(@Param("record") UserWeixin record, @Param("example") UserWeixinExample example);

    int updateByPrimaryKeySelective(UserWeixin record);

    int updateByPrimaryKey(UserWeixin record);
}
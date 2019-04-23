package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserBankInfo;
import com.shusheng.tihuzhai.dao.entity.auto.UserBankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBankInfoMapper {
    int countByExample(UserBankInfoExample example);

    int deleteByExample(UserBankInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserBankInfo record);

    int insertSelective(UserBankInfo record);

    List<UserBankInfo> selectByExample(UserBankInfoExample example);

    UserBankInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserBankInfo record, @Param("example") UserBankInfoExample example);

    int updateByExample(@Param("record") UserBankInfo record, @Param("example") UserBankInfoExample example);

    int updateByPrimaryKeySelective(UserBankInfo record);

    int updateByPrimaryKey(UserBankInfo record);
}
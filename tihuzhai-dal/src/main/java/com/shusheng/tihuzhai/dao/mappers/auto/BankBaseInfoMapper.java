package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.BankBaseInfo;
import com.shusheng.tihuzhai.dao.entity.auto.BankBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankBaseInfoMapper {
    int countByExample(BankBaseInfoExample example);

    int deleteByExample(BankBaseInfoExample example);

    int deleteByPrimaryKey(String bankCode);

    int insert(BankBaseInfo record);

    int insertSelective(BankBaseInfo record);

    List<BankBaseInfo> selectByExample(BankBaseInfoExample example);

    BankBaseInfo selectByPrimaryKey(String bankCode);

    int updateByExampleSelective(@Param("record") BankBaseInfo record, @Param("example") BankBaseInfoExample example);

    int updateByExample(@Param("record") BankBaseInfo record, @Param("example") BankBaseInfoExample example);

    int updateByPrimaryKeySelective(BankBaseInfo record);

    int updateByPrimaryKey(BankBaseInfo record);
}
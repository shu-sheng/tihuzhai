package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.CommonBankInfo;
import com.shusheng.tihuzhai.dao.entity.auto.CommonBankInfoExample;
import com.shusheng.tihuzhai.dao.entity.auto.CommonBankInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonBankInfoMapper {
    int countByExample(CommonBankInfoExample example);

    int deleteByExample(CommonBankInfoExample example);

    int deleteByPrimaryKey(Integer bankId);

    int insert(CommonBankInfoWithBLOBs record);

    int insertSelective(CommonBankInfoWithBLOBs record);

    List<CommonBankInfoWithBLOBs> selectByExampleWithBLOBs(CommonBankInfoExample example);

    List<CommonBankInfo> selectByExample(CommonBankInfoExample example);

    CommonBankInfoWithBLOBs selectByPrimaryKey(Integer bankId);

    int updateByExampleSelective(@Param("record") CommonBankInfoWithBLOBs record, @Param("example") CommonBankInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CommonBankInfoWithBLOBs record, @Param("example") CommonBankInfoExample example);

    int updateByExample(@Param("record") CommonBankInfo record, @Param("example") CommonBankInfoExample example);

    int updateByPrimaryKeySelective(CommonBankInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommonBankInfoWithBLOBs record);

    int updateByPrimaryKey(CommonBankInfo record);
}
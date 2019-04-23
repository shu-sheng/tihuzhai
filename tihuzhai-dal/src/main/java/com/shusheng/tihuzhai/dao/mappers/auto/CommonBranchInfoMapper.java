package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.CommonBranchInfo;
import com.shusheng.tihuzhai.dao.entity.auto.CommonBranchInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonBranchInfoMapper {
    int countByExample(CommonBranchInfoExample example);

    int deleteByExample(CommonBranchInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonBranchInfo record);

    int insertSelective(CommonBranchInfo record);

    List<CommonBranchInfo> selectByExample(CommonBranchInfoExample example);

    CommonBranchInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonBranchInfo record, @Param("example") CommonBranchInfoExample example);

    int updateByExample(@Param("record") CommonBranchInfo record, @Param("example") CommonBranchInfoExample example);

    int updateByPrimaryKeySelective(CommonBranchInfo record);

    int updateByPrimaryKey(CommonBranchInfo record);
}
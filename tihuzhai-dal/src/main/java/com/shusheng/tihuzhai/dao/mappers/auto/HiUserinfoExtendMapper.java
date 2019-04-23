package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiUserinfoExtend;
import com.shusheng.tihuzhai.dao.entity.auto.HiUserinfoExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiUserinfoExtendMapper {
    int countByExample(HiUserinfoExtendExample example);

    int deleteByExample(HiUserinfoExtendExample example);

    int deleteByPrimaryKey(String userBaseId);

    int insert(HiUserinfoExtend record);

    int insertSelective(HiUserinfoExtend record);

    List<HiUserinfoExtend> selectByExample(HiUserinfoExtendExample example);

    HiUserinfoExtend selectByPrimaryKey(String userBaseId);

    int updateByExampleSelective(@Param("record") HiUserinfoExtend record, @Param("example") HiUserinfoExtendExample example);

    int updateByExample(@Param("record") HiUserinfoExtend record, @Param("example") HiUserinfoExtendExample example);

    int updateByPrimaryKeySelective(HiUserinfoExtend record);

    int updateByPrimaryKey(HiUserinfoExtend record);
}
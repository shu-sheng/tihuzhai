package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcUser;
import com.shusheng.tihuzhai.dao.entity.auto.AcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcUserMapper {
    int countByExample(AcUserExample example);

    int deleteByExample(AcUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcUser record);

    int insertSelective(AcUser record);

    List<AcUser> selectByExample(AcUserExample example);

    AcUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcUser record, @Param("example") AcUserExample example);

    int updateByExample(@Param("record") AcUser record, @Param("example") AcUserExample example);

    int updateByPrimaryKeySelective(AcUser record);

    int updateByPrimaryKey(AcUser record);
}
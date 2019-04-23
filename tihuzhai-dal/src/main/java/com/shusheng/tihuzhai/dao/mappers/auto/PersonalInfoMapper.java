package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PersonalInfo;
import com.shusheng.tihuzhai.dao.entity.auto.PersonalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalInfoMapper {
    int countByExample(PersonalInfoExample example);

    int deleteByExample(PersonalInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PersonalInfo record);

    int insertSelective(PersonalInfo record);

    List<PersonalInfo> selectByExample(PersonalInfoExample example);

    PersonalInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PersonalInfo record, @Param("example") PersonalInfoExample example);

    int updateByExample(@Param("record") PersonalInfo record, @Param("example") PersonalInfoExample example);

    int updateByPrimaryKeySelective(PersonalInfo record);

    int updateByPrimaryKey(PersonalInfo record);
}
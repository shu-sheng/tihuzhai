package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.InstitutionsInfo;
import com.shusheng.tihuzhai.dao.entity.auto.InstitutionsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstitutionsInfoMapper {
    int countByExample(InstitutionsInfoExample example);

    int deleteByExample(InstitutionsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InstitutionsInfo record);

    int insertSelective(InstitutionsInfo record);

    List<InstitutionsInfo> selectByExample(InstitutionsInfoExample example);

    InstitutionsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InstitutionsInfo record, @Param("example") InstitutionsInfoExample example);

    int updateByExample(@Param("record") InstitutionsInfo record, @Param("example") InstitutionsInfoExample example);

    int updateByPrimaryKeySelective(InstitutionsInfo record);

    int updateByPrimaryKey(InstitutionsInfo record);
}
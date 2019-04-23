package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AgreementManage;
import com.shusheng.tihuzhai.dao.entity.auto.AgreementManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgreementManageMapper {
    int countByExample(AgreementManageExample example);

    int deleteByExample(AgreementManageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AgreementManage record);

    int insertSelective(AgreementManage record);

    List<AgreementManage> selectByExampleWithBLOBs(AgreementManageExample example);

    List<AgreementManage> selectByExample(AgreementManageExample example);

    AgreementManage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AgreementManage record, @Param("example") AgreementManageExample example);

    int updateByExampleWithBLOBs(@Param("record") AgreementManage record, @Param("example") AgreementManageExample example);

    int updateByExample(@Param("record") AgreementManage record, @Param("example") AgreementManageExample example);

    int updateByPrimaryKeySelective(AgreementManage record);

    int updateByPrimaryKeyWithBLOBs(AgreementManage record);

    int updateByPrimaryKey(AgreementManage record);
}
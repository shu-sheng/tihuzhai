package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TypeManage;
import com.shusheng.tihuzhai.dao.entity.auto.TypeManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeManageMapper {
    int countByExample(TypeManageExample example);

    int deleteByExample(TypeManageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TypeManage record);

    int insertSelective(TypeManage record);

    List<TypeManage> selectByExample(TypeManageExample example);

    TypeManage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TypeManage record, @Param("example") TypeManageExample example);

    int updateByExample(@Param("record") TypeManage record, @Param("example") TypeManageExample example);

    int updateByPrimaryKeySelective(TypeManage record);

    int updateByPrimaryKey(TypeManage record);
}
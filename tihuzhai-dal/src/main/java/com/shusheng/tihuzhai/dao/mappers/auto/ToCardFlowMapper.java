package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.ToCardFlow;
import com.shusheng.tihuzhai.dao.entity.auto.ToCardFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToCardFlowMapper {
    int countByExample(ToCardFlowExample example);

    int deleteByExample(ToCardFlowExample example);

    int deleteByPrimaryKey(Long flowId);

    int insert(ToCardFlow record);

    int insertSelective(ToCardFlow record);

    List<ToCardFlow> selectByExample(ToCardFlowExample example);

    ToCardFlow selectByPrimaryKey(Long flowId);

    int updateByExampleSelective(@Param("record") ToCardFlow record, @Param("example") ToCardFlowExample example);

    int updateByExample(@Param("record") ToCardFlow record, @Param("example") ToCardFlowExample example);

    int updateByPrimaryKeySelective(ToCardFlow record);

    int updateByPrimaryKey(ToCardFlow record);
}
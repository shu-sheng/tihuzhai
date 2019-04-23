package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.RechargeFlow;
import com.shusheng.tihuzhai.dao.entity.auto.RechargeFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeFlowMapper {
    int countByExample(RechargeFlowExample example);

    int deleteByExample(RechargeFlowExample example);

    int deleteByPrimaryKey(Long flowId);

    int insert(RechargeFlow record);

    int insertSelective(RechargeFlow record);

    List<RechargeFlow> selectByExample(RechargeFlowExample example);

    RechargeFlow selectByPrimaryKey(Long flowId);

    int updateByExampleSelective(@Param("record") RechargeFlow record, @Param("example") RechargeFlowExample example);

    int updateByExample(@Param("record") RechargeFlow record, @Param("example") RechargeFlowExample example);

    int updateByPrimaryKeySelective(RechargeFlow record);

    int updateByPrimaryKey(RechargeFlow record);
}
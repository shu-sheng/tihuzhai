package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PaymentFlow;
import com.shusheng.tihuzhai.dao.entity.auto.PaymentFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentFlowMapper {
    int countByExample(PaymentFlowExample example);

    int deleteByExample(PaymentFlowExample example);

    int deleteByPrimaryKey(String paymentFlowId);

    int insert(PaymentFlow record);

    int insertSelective(PaymentFlow record);

    List<PaymentFlow> selectByExample(PaymentFlowExample example);

    PaymentFlow selectByPrimaryKey(String paymentFlowId);

    int updateByExampleSelective(@Param("record") PaymentFlow record, @Param("example") PaymentFlowExample example);

    int updateByExample(@Param("record") PaymentFlow record, @Param("example") PaymentFlowExample example);

    int updateByPrimaryKeySelective(PaymentFlow record);

    int updateByPrimaryKey(PaymentFlow record);
}
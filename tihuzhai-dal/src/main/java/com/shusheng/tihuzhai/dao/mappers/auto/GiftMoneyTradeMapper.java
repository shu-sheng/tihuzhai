package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyTrade;
import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyTradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftMoneyTradeMapper {
    int countByExample(GiftMoneyTradeExample example);

    int deleteByExample(GiftMoneyTradeExample example);

    int deleteByPrimaryKey(Long giftTradeId);

    int insert(GiftMoneyTrade record);

    int insertSelective(GiftMoneyTrade record);

    List<GiftMoneyTrade> selectByExample(GiftMoneyTradeExample example);

    GiftMoneyTrade selectByPrimaryKey(Long giftTradeId);

    int updateByExampleSelective(@Param("record") GiftMoneyTrade record, @Param("example") GiftMoneyTradeExample example);

    int updateByExample(@Param("record") GiftMoneyTrade record, @Param("example") GiftMoneyTradeExample example);

    int updateByPrimaryKeySelective(GiftMoneyTrade record);

    int updateByPrimaryKey(GiftMoneyTrade record);
}
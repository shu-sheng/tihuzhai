package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.GiftMoney;
import com.shusheng.tihuzhai.dao.entity.auto.GiftMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftMoneyMapper {
    int countByExample(GiftMoneyExample example);

    int deleteByExample(GiftMoneyExample example);

    int deleteByPrimaryKey(Long giftId);

    int insert(GiftMoney record);

    int insertSelective(GiftMoney record);

    List<GiftMoney> selectByExample(GiftMoneyExample example);

    GiftMoney selectByPrimaryKey(Long giftId);

    int updateByExampleSelective(@Param("record") GiftMoney record, @Param("example") GiftMoneyExample example);

    int updateByExample(@Param("record") GiftMoney record, @Param("example") GiftMoneyExample example);

    int updateByPrimaryKeySelective(GiftMoney record);

    int updateByPrimaryKey(GiftMoney record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblShopCart;
import com.shusheng.tihuzhai.dao.entity.auto.TblShopCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblShopCartMapper {
    int countByExample(TblShopCartExample example);

    int deleteByExample(TblShopCartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblShopCart record);

    int insertSelective(TblShopCart record);

    List<TblShopCart> selectByExample(TblShopCartExample example);

    TblShopCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblShopCart record, @Param("example") TblShopCartExample example);

    int updateByExample(@Param("record") TblShopCart record, @Param("example") TblShopCartExample example);

    int updateByPrimaryKeySelective(TblShopCart record);

    int updateByPrimaryKey(TblShopCart record);
}
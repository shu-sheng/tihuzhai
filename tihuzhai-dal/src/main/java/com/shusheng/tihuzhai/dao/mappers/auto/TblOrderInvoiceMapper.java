package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblOrderInvoice;
import com.shusheng.tihuzhai.dao.entity.auto.TblOrderInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOrderInvoiceMapper {
    int countByExample(TblOrderInvoiceExample example);

    int deleteByExample(TblOrderInvoiceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblOrderInvoice record);

    int insertSelective(TblOrderInvoice record);

    List<TblOrderInvoice> selectByExample(TblOrderInvoiceExample example);

    TblOrderInvoice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblOrderInvoice record, @Param("example") TblOrderInvoiceExample example);

    int updateByExample(@Param("record") TblOrderInvoice record, @Param("example") TblOrderInvoiceExample example);

    int updateByPrimaryKeySelective(TblOrderInvoice record);

    int updateByPrimaryKey(TblOrderInvoice record);
}
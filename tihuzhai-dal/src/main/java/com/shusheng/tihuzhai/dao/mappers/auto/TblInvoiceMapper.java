package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblInvoice;
import com.shusheng.tihuzhai.dao.entity.auto.TblInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblInvoiceMapper {
    int countByExample(TblInvoiceExample example);

    int deleteByExample(TblInvoiceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblInvoice record);

    int insertSelective(TblInvoice record);

    List<TblInvoice> selectByExample(TblInvoiceExample example);

    TblInvoice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblInvoice record, @Param("example") TblInvoiceExample example);

    int updateByExample(@Param("record") TblInvoice record, @Param("example") TblInvoiceExample example);

    int updateByPrimaryKeySelective(TblInvoice record);

    int updateByPrimaryKey(TblInvoice record);
}
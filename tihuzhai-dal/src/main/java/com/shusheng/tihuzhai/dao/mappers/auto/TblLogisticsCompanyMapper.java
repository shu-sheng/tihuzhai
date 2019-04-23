package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblLogisticsCompany;
import com.shusheng.tihuzhai.dao.entity.auto.TblLogisticsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblLogisticsCompanyMapper {
    int countByExample(TblLogisticsCompanyExample example);

    int deleteByExample(TblLogisticsCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblLogisticsCompany record);

    int insertSelective(TblLogisticsCompany record);

    List<TblLogisticsCompany> selectByExample(TblLogisticsCompanyExample example);

    TblLogisticsCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblLogisticsCompany record, @Param("example") TblLogisticsCompanyExample example);

    int updateByExample(@Param("record") TblLogisticsCompany record, @Param("example") TblLogisticsCompanyExample example);

    int updateByPrimaryKeySelective(TblLogisticsCompany record);

    int updateByPrimaryKey(TblLogisticsCompany record);
}
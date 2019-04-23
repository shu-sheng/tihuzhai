package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PdfTemplate;
import com.shusheng.tihuzhai.dao.entity.auto.PdfTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdfTemplateMapper {
    int countByExample(PdfTemplateExample example);

    int deleteByExample(PdfTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PdfTemplate record);

    int insertSelective(PdfTemplate record);

    List<PdfTemplate> selectByExampleWithBLOBs(PdfTemplateExample example);

    List<PdfTemplate> selectByExample(PdfTemplateExample example);

    PdfTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PdfTemplate record, @Param("example") PdfTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") PdfTemplate record, @Param("example") PdfTemplateExample example);

    int updateByExample(@Param("record") PdfTemplate record, @Param("example") PdfTemplateExample example);

    int updateByPrimaryKeySelective(PdfTemplate record);

    int updateByPrimaryKeyWithBLOBs(PdfTemplate record);

    int updateByPrimaryKey(PdfTemplate record);
}
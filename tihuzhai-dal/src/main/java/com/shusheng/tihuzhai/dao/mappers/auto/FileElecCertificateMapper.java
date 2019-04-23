package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.FileElecCertificate;
import com.shusheng.tihuzhai.dao.entity.auto.FileElecCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileElecCertificateMapper {
    int countByExample(FileElecCertificateExample example);

    int deleteByExample(FileElecCertificateExample example);

    int deleteByPrimaryKey(String fileKey);

    int insert(FileElecCertificate record);

    int insertSelective(FileElecCertificate record);

    List<FileElecCertificate> selectByExample(FileElecCertificateExample example);

    FileElecCertificate selectByPrimaryKey(String fileKey);

    int updateByExampleSelective(@Param("record") FileElecCertificate record, @Param("example") FileElecCertificateExample example);

    int updateByExample(@Param("record") FileElecCertificate record, @Param("example") FileElecCertificateExample example);

    int updateByPrimaryKeySelective(FileElecCertificate record);

    int updateByPrimaryKey(FileElecCertificate record);
}
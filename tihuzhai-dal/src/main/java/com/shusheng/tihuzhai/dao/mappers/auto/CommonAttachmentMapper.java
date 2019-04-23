package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.CommonAttachment;
import com.shusheng.tihuzhai.dao.entity.auto.CommonAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonAttachmentMapper {
    int countByExample(CommonAttachmentExample example);

    int deleteByExample(CommonAttachmentExample example);

    int deleteByPrimaryKey(Long attachmentId);

    int insert(CommonAttachment record);

    int insertSelective(CommonAttachment record);

    List<CommonAttachment> selectByExample(CommonAttachmentExample example);

    CommonAttachment selectByPrimaryKey(Long attachmentId);

    int updateByExampleSelective(@Param("record") CommonAttachment record, @Param("example") CommonAttachmentExample example);

    int updateByExample(@Param("record") CommonAttachment record, @Param("example") CommonAttachmentExample example);

    int updateByPrimaryKeySelective(CommonAttachment record);

    int updateByPrimaryKey(CommonAttachment record);
}
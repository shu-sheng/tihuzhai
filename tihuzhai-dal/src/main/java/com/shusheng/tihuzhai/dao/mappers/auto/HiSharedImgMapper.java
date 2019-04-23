package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiSharedImg;
import com.shusheng.tihuzhai.dao.entity.auto.HiSharedImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiSharedImgMapper {
    int countByExample(HiSharedImgExample example);

    int deleteByExample(HiSharedImgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiSharedImg record);

    int insertSelective(HiSharedImg record);

    List<HiSharedImg> selectByExample(HiSharedImgExample example);

    HiSharedImg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiSharedImg record, @Param("example") HiSharedImgExample example);

    int updateByExample(@Param("record") HiSharedImg record, @Param("example") HiSharedImgExample example);

    int updateByPrimaryKeySelective(HiSharedImg record);

    int updateByPrimaryKey(HiSharedImg record);
}
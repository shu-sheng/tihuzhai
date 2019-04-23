package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiUserStudyDest;
import com.shusheng.tihuzhai.dao.entity.auto.HiUserStudyDestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiUserStudyDestMapper {
    int countByExample(HiUserStudyDestExample example);

    int deleteByExample(HiUserStudyDestExample example);

    int insert(HiUserStudyDest record);

    int insertSelective(HiUserStudyDest record);

    List<HiUserStudyDest> selectByExample(HiUserStudyDestExample example);

    int updateByExampleSelective(@Param("record") HiUserStudyDest record, @Param("example") HiUserStudyDestExample example);

    int updateByExample(@Param("record") HiUserStudyDest record, @Param("example") HiUserStudyDestExample example);
}
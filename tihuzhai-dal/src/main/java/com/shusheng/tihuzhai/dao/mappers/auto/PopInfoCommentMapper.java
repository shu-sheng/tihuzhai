package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.PopInfoComment;
import com.shusheng.tihuzhai.dao.entity.auto.PopInfoCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PopInfoCommentMapper {
    int countByExample(PopInfoCommentExample example);

    int deleteByExample(PopInfoCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PopInfoComment record);

    int insertSelective(PopInfoComment record);

    List<PopInfoComment> selectByExampleWithBLOBs(PopInfoCommentExample example);

    List<PopInfoComment> selectByExample(PopInfoCommentExample example);

    PopInfoComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PopInfoComment record, @Param("example") PopInfoCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") PopInfoComment record, @Param("example") PopInfoCommentExample example);

    int updateByExample(@Param("record") PopInfoComment record, @Param("example") PopInfoCommentExample example);

    int updateByPrimaryKeySelective(PopInfoComment record);

    int updateByPrimaryKeyWithBLOBs(PopInfoComment record);

    int updateByPrimaryKey(PopInfoComment record);
}
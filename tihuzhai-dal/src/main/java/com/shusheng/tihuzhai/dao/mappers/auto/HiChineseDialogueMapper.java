package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiChineseDialogue;
import com.shusheng.tihuzhai.dao.entity.auto.HiChineseDialogueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiChineseDialogueMapper {
    int countByExample(HiChineseDialogueExample example);

    int deleteByExample(HiChineseDialogueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiChineseDialogue record);

    int insertSelective(HiChineseDialogue record);

    List<HiChineseDialogue> selectByExample(HiChineseDialogueExample example);

    HiChineseDialogue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiChineseDialogue record, @Param("example") HiChineseDialogueExample example);

    int updateByExample(@Param("record") HiChineseDialogue record, @Param("example") HiChineseDialogueExample example);

    int updateByPrimaryKeySelective(HiChineseDialogue record);

    int updateByPrimaryKey(HiChineseDialogue record);
}
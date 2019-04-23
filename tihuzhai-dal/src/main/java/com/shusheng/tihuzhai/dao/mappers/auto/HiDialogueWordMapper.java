package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiDialogueWord;
import com.shusheng.tihuzhai.dao.entity.auto.HiDialogueWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiDialogueWordMapper {
    int countByExample(HiDialogueWordExample example);

    int deleteByExample(HiDialogueWordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiDialogueWord record);

    int insertSelective(HiDialogueWord record);

    List<HiDialogueWord> selectByExample(HiDialogueWordExample example);

    HiDialogueWord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiDialogueWord record, @Param("example") HiDialogueWordExample example);

    int updateByExample(@Param("record") HiDialogueWord record, @Param("example") HiDialogueWordExample example);

    int updateByPrimaryKeySelective(HiDialogueWord record);

    int updateByPrimaryKey(HiDialogueWord record);
}
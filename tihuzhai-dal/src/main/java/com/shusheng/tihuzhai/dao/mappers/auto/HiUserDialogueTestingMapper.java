package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiUserDialogueTesting;
import com.shusheng.tihuzhai.dao.entity.auto.HiUserDialogueTestingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiUserDialogueTestingMapper {
    int countByExample(HiUserDialogueTestingExample example);

    int deleteByExample(HiUserDialogueTestingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiUserDialogueTesting record);

    int insertSelective(HiUserDialogueTesting record);

    List<HiUserDialogueTesting> selectByExample(HiUserDialogueTestingExample example);

    HiUserDialogueTesting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiUserDialogueTesting record, @Param("example") HiUserDialogueTestingExample example);

    int updateByExample(@Param("record") HiUserDialogueTesting record, @Param("example") HiUserDialogueTestingExample example);

    int updateByPrimaryKeySelective(HiUserDialogueTesting record);

    int updateByPrimaryKey(HiUserDialogueTesting record);
}
package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.UserPraiseRecord;
import com.shusheng.tihuzhai.dao.entity.auto.UserPraiseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPraiseRecordMapper {
    int countByExample(UserPraiseRecordExample example);

    int deleteByExample(UserPraiseRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPraiseRecord record);

    int insertSelective(UserPraiseRecord record);

    List<UserPraiseRecord> selectByExample(UserPraiseRecordExample example);

    UserPraiseRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserPraiseRecord record, @Param("example") UserPraiseRecordExample example);

    int updateByExample(@Param("record") UserPraiseRecord record, @Param("example") UserPraiseRecordExample example);

    int updateByPrimaryKeySelective(UserPraiseRecord record);

    int updateByPrimaryKey(UserPraiseRecord record);
}
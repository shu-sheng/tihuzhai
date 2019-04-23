package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.TblUserBrowse;
import com.shusheng.tihuzhai.dao.entity.auto.TblUserBrowseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblUserBrowseMapper {
    int countByExample(TblUserBrowseExample example);

    int deleteByExample(TblUserBrowseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblUserBrowse record);

    int insertSelective(TblUserBrowse record);

    List<TblUserBrowse> selectByExample(TblUserBrowseExample example);

    TblUserBrowse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblUserBrowse record, @Param("example") TblUserBrowseExample example);

    int updateByExample(@Param("record") TblUserBrowse record, @Param("example") TblUserBrowseExample example);

    int updateByPrimaryKeySelective(TblUserBrowse record);

    int updateByPrimaryKey(TblUserBrowse record);
}
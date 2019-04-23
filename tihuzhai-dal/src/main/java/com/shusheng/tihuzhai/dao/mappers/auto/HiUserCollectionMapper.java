package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiUserCollection;
import com.shusheng.tihuzhai.dao.entity.auto.HiUserCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiUserCollectionMapper {
    int countByExample(HiUserCollectionExample example);

    int deleteByExample(HiUserCollectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiUserCollection record);

    int insertSelective(HiUserCollection record);

    List<HiUserCollection> selectByExample(HiUserCollectionExample example);

    HiUserCollection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiUserCollection record, @Param("example") HiUserCollectionExample example);

    int updateByExample(@Param("record") HiUserCollection record, @Param("example") HiUserCollectionExample example);

    int updateByPrimaryKeySelective(HiUserCollection record);

    int updateByPrimaryKey(HiUserCollection record);
}
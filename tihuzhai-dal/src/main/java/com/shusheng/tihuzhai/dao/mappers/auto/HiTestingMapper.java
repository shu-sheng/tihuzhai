package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.HiTesting;
import com.shusheng.tihuzhai.dao.entity.auto.HiTestingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiTestingMapper {
    int countByExample(HiTestingExample example);

    int deleteByExample(HiTestingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HiTesting record);

    int insertSelective(HiTesting record);

    List<HiTesting> selectByExample(HiTestingExample example);

    HiTesting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HiTesting record, @Param("example") HiTestingExample example);

    int updateByExample(@Param("record") HiTesting record, @Param("example") HiTestingExample example);

    int updateByPrimaryKeySelective(HiTesting record);

    int updateByPrimaryKey(HiTesting record);
}
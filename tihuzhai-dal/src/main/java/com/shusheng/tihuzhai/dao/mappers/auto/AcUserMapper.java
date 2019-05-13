package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcUser;
import com.shusheng.tihuzhai.dao.entity.auto.AcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AcUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int countByExample(AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int deleteByExample(AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int insert(AcUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int insertSelective(AcUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    List<AcUser> selectByExampleWithRowbounds(AcUserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    List<AcUser> selectByExample(AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    AcUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") AcUser record, @Param("example") AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByExample(@Param("record") AcUser record, @Param("example") AcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByPrimaryKeySelective(AcUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByPrimaryKey(AcUser record);
}
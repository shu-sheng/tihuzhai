package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcMenu;
import com.shusheng.tihuzhai.dao.entity.auto.AcMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AcMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int countByExample(AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int deleteByExample(AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int insert(AcMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int insertSelective(AcMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    List<AcMenu> selectByExampleWithRowbounds(AcMenuExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    List<AcMenu> selectByExample(AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    AcMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") AcMenu record, @Param("example") AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByExample(@Param("record") AcMenu record, @Param("example") AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByPrimaryKeySelective(AcMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByPrimaryKey(AcMenu record);
}
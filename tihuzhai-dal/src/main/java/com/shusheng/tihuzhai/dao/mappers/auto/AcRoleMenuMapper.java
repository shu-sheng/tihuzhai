package com.shusheng.tihuzhai.dao.mappers.auto;

import com.shusheng.tihuzhai.dao.entity.auto.AcRoleMenu;
import com.shusheng.tihuzhai.dao.entity.auto.AcRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AcRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int countByExample(AcRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int deleteByExample(AcRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int insert(AcRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int insertSelective(AcRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    List<AcRoleMenu> selectByExampleWithRowbounds(AcRoleMenuExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    List<AcRoleMenu> selectByExample(AcRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    AcRoleMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") AcRoleMenu record, @Param("example") AcRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByExample(@Param("record") AcRoleMenu record, @Param("example") AcRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByPrimaryKeySelective(AcRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_menu
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    int updateByPrimaryKey(AcRoleMenu record);
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.io.Serializable;
import java.util.Date;

public class AcRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.id
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.role_name
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.role_type
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private String roleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.role_status
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private String roleStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.memo
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.row_add_time
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private Date rowAddTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.row_update_time
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private Date rowUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ac_role
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.id
     *
     * @return the value of ac_role.id
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.id
     *
     * @param id the value for ac_role.id
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.role_name
     *
     * @return the value of ac_role.role_name
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.role_name
     *
     * @param roleName the value for ac_role.role_name
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.role_type
     *
     * @return the value of ac_role.role_type
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.role_type
     *
     * @param roleType the value for ac_role.role_type
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.role_status
     *
     * @return the value of ac_role.role_status
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public String getRoleStatus() {
        return roleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.role_status
     *
     * @param roleStatus the value for ac_role.role_status
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus == null ? null : roleStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.memo
     *
     * @return the value of ac_role.memo
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.memo
     *
     * @param memo the value for ac_role.memo
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.row_add_time
     *
     * @return the value of ac_role.row_add_time
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public Date getRowAddTime() {
        return rowAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.row_add_time
     *
     * @param rowAddTime the value for ac_role.row_add_time
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.row_update_time
     *
     * @return the value of ac_role.row_update_time
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.row_update_time
     *
     * @param rowUpdateTime the value for ac_role.row_update_time
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role
     *
     * @mbggenerated Mon May 13 14:12:13 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleType=").append(roleType);
        sb.append(", roleStatus=").append(roleStatus);
        sb.append(", memo=").append(memo);
        sb.append(", rowAddTime=").append(rowAddTime);
        sb.append(", rowUpdateTime=").append(rowUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
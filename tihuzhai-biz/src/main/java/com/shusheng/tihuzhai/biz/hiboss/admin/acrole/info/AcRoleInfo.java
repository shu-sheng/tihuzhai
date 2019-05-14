package com.shusheng.tihuzhai.biz.hiboss.admin.acrole.info;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiInfoBase;

import java.util.Date;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 10:24
 */
public class AcRoleInfo extends TiHuZhaiInfoBase {
    private static final long serialVersionUID = -3629746551932347173L;

    private Long id;

    private String roleName;

    private String roleType;

    private String roleStatus;

    private String memo;

    private Date rowAddTime;

    private Date rowUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getRowAddTime() {
        return rowAddTime;
    }

    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }
}

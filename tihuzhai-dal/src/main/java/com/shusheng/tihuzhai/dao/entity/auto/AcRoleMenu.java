package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class AcRoleMenu {
    private Long id;

    private Long roleId;

    private Long menuId;

    private String status;

    private Date rowAddTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getRowAddTime() {
        return rowAddTime;
    }

    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }
}
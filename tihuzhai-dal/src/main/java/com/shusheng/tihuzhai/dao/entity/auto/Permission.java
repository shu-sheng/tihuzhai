package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class Permission {
    private Integer permissionId;

    private String permissionCode;

    private String permissionName;

    private String permissionType;

    private String permissionOperate;

    private String permissionCallback;

    private String permissionNote;

    private Integer permissionParentId;

    private Integer sort;

    private String isMenu;

    private String status;

    private String iconUrl1;

    private String iconUrl2;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType == null ? null : permissionType.trim();
    }

    public String getPermissionOperate() {
        return permissionOperate;
    }

    public void setPermissionOperate(String permissionOperate) {
        this.permissionOperate = permissionOperate == null ? null : permissionOperate.trim();
    }

    public String getPermissionCallback() {
        return permissionCallback;
    }

    public void setPermissionCallback(String permissionCallback) {
        this.permissionCallback = permissionCallback == null ? null : permissionCallback.trim();
    }

    public String getPermissionNote() {
        return permissionNote;
    }

    public void setPermissionNote(String permissionNote) {
        this.permissionNote = permissionNote == null ? null : permissionNote.trim();
    }

    public Integer getPermissionParentId() {
        return permissionParentId;
    }

    public void setPermissionParentId(Integer permissionParentId) {
        this.permissionParentId = permissionParentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIsMenu() {
        return isMenu;
    }

    public void setIsMenu(String isMenu) {
        this.isMenu = isMenu == null ? null : isMenu.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIconUrl1() {
        return iconUrl1;
    }

    public void setIconUrl1(String iconUrl1) {
        this.iconUrl1 = iconUrl1 == null ? null : iconUrl1.trim();
    }

    public String getIconUrl2() {
        return iconUrl2;
    }

    public void setIconUrl2(String iconUrl2) {
        this.iconUrl2 = iconUrl2 == null ? null : iconUrl2.trim();
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblUserBrowse {
    private Long id;

    private Long userId;

    private Long supplierId;

    private String browseUrl;

    private String browsePageName;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getBrowseUrl() {
        return browseUrl;
    }

    public void setBrowseUrl(String browseUrl) {
        this.browseUrl = browseUrl == null ? null : browseUrl.trim();
    }

    public String getBrowsePageName() {
        return browsePageName;
    }

    public void setBrowsePageName(String browsePageName) {
        this.browsePageName = browsePageName == null ? null : browsePageName.trim();
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
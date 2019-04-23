package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserPraiseRecord {
    private Long id;

    private Long userId;

    private Long userRelationId;

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

    public Long getUserRelationId() {
        return userRelationId;
    }

    public void setUserRelationId(Long userRelationId) {
        this.userRelationId = userRelationId;
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
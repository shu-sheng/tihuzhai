package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserName {
    private Integer id;

    private Long userName;

    private String refererNo;

    private Date rowAddTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserName() {
        return userName;
    }

    public void setUserName(Long userName) {
        this.userName = userName;
    }

    public String getRefererNo() {
        return refererNo;
    }

    public void setRefererNo(String refererNo) {
        this.refererNo = refererNo == null ? null : refererNo.trim();
    }

    public Date getRowAddTime() {
        return rowAddTime;
    }

    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }
}
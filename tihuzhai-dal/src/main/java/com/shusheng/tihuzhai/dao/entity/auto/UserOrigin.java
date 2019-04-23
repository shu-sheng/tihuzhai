package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserOrigin extends UserOriginKey {
    private String refererNo;

    private Date rawAddTime;

    private String rawUpdateTime;

    private String relationProperty;

    private String relationProperty1;

    private String mail;

    private String mobile;

    private String realName;

    private String certNo;

    private String accountId;

    public String getRefererNo() {
        return refererNo;
    }

    public void setRefererNo(String refererNo) {
        this.refererNo = refererNo == null ? null : refererNo.trim();
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public String getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(String rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime == null ? null : rawUpdateTime.trim();
    }

    public String getRelationProperty() {
        return relationProperty;
    }

    public void setRelationProperty(String relationProperty) {
        this.relationProperty = relationProperty == null ? null : relationProperty.trim();
    }

    public String getRelationProperty1() {
        return relationProperty1;
    }

    public void setRelationProperty1(String relationProperty1) {
        this.relationProperty1 = relationProperty1 == null ? null : relationProperty1.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserInterest {
    private Long userInterestId;

    private String userInterestType;

    private String userLevel;

    private String relationValue1;

    private String relationValue2;

    private String relationValue3;

    private Date rawUpdateTime;

    private Date rawAddTime;

    public Long getUserInterestId() {
        return userInterestId;
    }

    public void setUserInterestId(Long userInterestId) {
        this.userInterestId = userInterestId;
    }

    public String getUserInterestType() {
        return userInterestType;
    }

    public void setUserInterestType(String userInterestType) {
        this.userInterestType = userInterestType == null ? null : userInterestType.trim();
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public String getRelationValue1() {
        return relationValue1;
    }

    public void setRelationValue1(String relationValue1) {
        this.relationValue1 = relationValue1 == null ? null : relationValue1.trim();
    }

    public String getRelationValue2() {
        return relationValue2;
    }

    public void setRelationValue2(String relationValue2) {
        this.relationValue2 = relationValue2 == null ? null : relationValue2.trim();
    }

    public String getRelationValue3() {
        return relationValue3;
    }

    public void setRelationValue3(String relationValue3) {
        this.relationValue3 = relationValue3 == null ? null : relationValue3.trim();
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }
}
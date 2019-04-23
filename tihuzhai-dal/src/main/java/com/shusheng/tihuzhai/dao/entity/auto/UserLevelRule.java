package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserLevelRule {
    private Long ruleId;

    private String userLevel;

    private String ruleType;

    private String ruleTypeParam1;

    private String ruleTypeParam;

    private Integer priority;

    private String startValue;

    private String endValue;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    public String getRuleTypeParam1() {
        return ruleTypeParam1;
    }

    public void setRuleTypeParam1(String ruleTypeParam1) {
        this.ruleTypeParam1 = ruleTypeParam1 == null ? null : ruleTypeParam1.trim();
    }

    public String getRuleTypeParam() {
        return ruleTypeParam;
    }

    public void setRuleTypeParam(String ruleTypeParam) {
        this.ruleTypeParam = ruleTypeParam == null ? null : ruleTypeParam.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getStartValue() {
        return startValue;
    }

    public void setStartValue(String startValue) {
        this.startValue = startValue == null ? null : startValue.trim();
    }

    public String getEndValue() {
        return endValue;
    }

    public void setEndValue(String endValue) {
        this.endValue = endValue == null ? null : endValue.trim();
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
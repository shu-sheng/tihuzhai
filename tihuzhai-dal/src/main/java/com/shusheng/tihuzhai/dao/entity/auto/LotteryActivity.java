package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class LotteryActivity {
    private Long id;

    private String name;

    private Date startTime;

    private Date endTime;

    private String lotterType;

    private Date conditionBeginDate;

    private Date conditionEndDate;

    private Long prizeRuleId;

    private String prizeRuleName;

    private Long peopleNum;

    private String status;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLotterType() {
        return lotterType;
    }

    public void setLotterType(String lotterType) {
        this.lotterType = lotterType == null ? null : lotterType.trim();
    }

    public Date getConditionBeginDate() {
        return conditionBeginDate;
    }

    public void setConditionBeginDate(Date conditionBeginDate) {
        this.conditionBeginDate = conditionBeginDate;
    }

    public Date getConditionEndDate() {
        return conditionEndDate;
    }

    public void setConditionEndDate(Date conditionEndDate) {
        this.conditionEndDate = conditionEndDate;
    }

    public Long getPrizeRuleId() {
        return prizeRuleId;
    }

    public void setPrizeRuleId(Long prizeRuleId) {
        this.prizeRuleId = prizeRuleId;
    }

    public String getPrizeRuleName() {
        return prizeRuleName;
    }

    public void setPrizeRuleName(String prizeRuleName) {
        this.prizeRuleName = prizeRuleName == null ? null : prizeRuleName.trim();
    }

    public Long getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Long peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
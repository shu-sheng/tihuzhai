package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class LotteryActivityInstance {
    private Long instanceId;

    private Long activityId;

    private String name;

    private Date startTime;

    private Date endTime;

    private String lotteryType;

    private Date conditionBeginDate;

    private Date conditionEndDate;

    private Long prizeRuleId;

    private String prizeRuleName;

    private Long peopleNum;

    private Long lotteryNum;

    private Long surplusNum;

    private Long tobeWinnerNum;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
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

    public String getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(String lotteryType) {
        this.lotteryType = lotteryType == null ? null : lotteryType.trim();
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

    public Long getLotteryNum() {
        return lotteryNum;
    }

    public void setLotteryNum(Long lotteryNum) {
        this.lotteryNum = lotteryNum;
    }

    public Long getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Long surplusNum) {
        this.surplusNum = surplusNum;
    }

    public Long getTobeWinnerNum() {
        return tobeWinnerNum;
    }

    public void setTobeWinnerNum(Long tobeWinnerNum) {
        this.tobeWinnerNum = tobeWinnerNum;
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
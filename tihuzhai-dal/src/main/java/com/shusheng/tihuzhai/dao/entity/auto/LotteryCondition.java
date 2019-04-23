package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class LotteryCondition {
    private Long lotteryConditionId;

    private Long lotteryId;

    private Long seqNum;

    private String lotteryConditionType;

    private String conditionValue;

    private String lotteryTimesType;

    private Integer startPeriod;

    private Integer endPeriod;

    private Long time;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getLotteryConditionId() {
        return lotteryConditionId;
    }

    public void setLotteryConditionId(Long lotteryConditionId) {
        this.lotteryConditionId = lotteryConditionId;
    }

    public Long getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Long lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Long seqNum) {
        this.seqNum = seqNum;
    }

    public String getLotteryConditionType() {
        return lotteryConditionType;
    }

    public void setLotteryConditionType(String lotteryConditionType) {
        this.lotteryConditionType = lotteryConditionType == null ? null : lotteryConditionType.trim();
    }

    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue == null ? null : conditionValue.trim();
    }

    public String getLotteryTimesType() {
        return lotteryTimesType;
    }

    public void setLotteryTimesType(String lotteryTimesType) {
        this.lotteryTimesType = lotteryTimesType == null ? null : lotteryTimesType.trim();
    }

    public Integer getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    public Integer getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(Integer endPeriod) {
        this.endPeriod = endPeriod;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
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
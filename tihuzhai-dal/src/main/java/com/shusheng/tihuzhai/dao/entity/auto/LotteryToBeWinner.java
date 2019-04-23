package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class LotteryToBeWinner {
    private Long toBeWinnerId;

    private Long activityId;

    private Long instanceId;

    private Long winnerNumber;

    private Long prizeRuleDetailId;

    private String awards;

    private String prizeName;

    private String prizeType;

    private Long prizeNum;

    private Long prizeAmount;

    private String prizeImage;

    private String description;

    private String memo;

    private String winnerStatus;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getToBeWinnerId() {
        return toBeWinnerId;
    }

    public void setToBeWinnerId(Long toBeWinnerId) {
        this.toBeWinnerId = toBeWinnerId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public Long getWinnerNumber() {
        return winnerNumber;
    }

    public void setWinnerNumber(Long winnerNumber) {
        this.winnerNumber = winnerNumber;
    }

    public Long getPrizeRuleDetailId() {
        return prizeRuleDetailId;
    }

    public void setPrizeRuleDetailId(Long prizeRuleDetailId) {
        this.prizeRuleDetailId = prizeRuleDetailId;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards == null ? null : awards.trim();
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    public String getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType == null ? null : prizeType.trim();
    }

    public Long getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(Long prizeNum) {
        this.prizeNum = prizeNum;
    }

    public Long getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(Long prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public String getPrizeImage() {
        return prizeImage;
    }

    public void setPrizeImage(String prizeImage) {
        this.prizeImage = prizeImage == null ? null : prizeImage.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getWinnerStatus() {
        return winnerStatus;
    }

    public void setWinnerStatus(String winnerStatus) {
        this.winnerStatus = winnerStatus == null ? null : winnerStatus.trim();
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
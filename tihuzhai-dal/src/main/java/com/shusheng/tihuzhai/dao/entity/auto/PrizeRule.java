package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class PrizeRule {
    private Long prizeRuleId;

    private String prizeRuleName;

    private Double winningRate;

    private Long prizeNum;

    private Long notWinningNum;

    private String description;

    private Date rawAddTime;

    private Date rawUpdateTime;

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

    public Double getWinningRate() {
        return winningRate;
    }

    public void setWinningRate(Double winningRate) {
        this.winningRate = winningRate;
    }

    public Long getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(Long prizeNum) {
        this.prizeNum = prizeNum;
    }

    public Long getNotWinningNum() {
        return notWinningNum;
    }

    public void setNotWinningNum(Long notWinningNum) {
        this.notWinningNum = notWinningNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class PrizeRuleDetail {
    private Long prizeRuleDetailId;

    private Long prizeRuleId;

    private Long seqNum;

    private String awards;

    private String prizeName;

    private String prizeType;

    private Long prizeNum;

    private Double prizeAmount;

    private Double probability;

    private String prizeImage;

    private String description;

    private String memo;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getPrizeRuleDetailId() {
        return prizeRuleDetailId;
    }

    public void setPrizeRuleDetailId(Long prizeRuleDetailId) {
        this.prizeRuleDetailId = prizeRuleDetailId;
    }

    public Long getPrizeRuleId() {
        return prizeRuleId;
    }

    public void setPrizeRuleId(Long prizeRuleId) {
        this.prizeRuleId = prizeRuleId;
    }

    public Long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Long seqNum) {
        this.seqNum = seqNum;
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

    public Double getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(Double prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
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
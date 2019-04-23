package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class GiftMoneyRule {
    private Long giftRuleId;

    private Long giftId;

    private String giftRuleName;

    private String ruleType;

    private String type;

    private String status;

    private String rule;

    private String ruleAmount;

    private String amount;

    private Long createUserid;

    private String createUsername;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String description;

    public Long getGiftRuleId() {
        return giftRuleId;
    }

    public void setGiftRuleId(Long giftRuleId) {
        this.giftRuleId = giftRuleId;
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public String getGiftRuleName() {
        return giftRuleName;
    }

    public void setGiftRuleName(String giftRuleName) {
        this.giftRuleName = giftRuleName == null ? null : giftRuleName.trim();
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule == null ? null : rule.trim();
    }

    public String getRuleAmount() {
        return ruleAmount;
    }

    public void setRuleAmount(String ruleAmount) {
        this.ruleAmount = ruleAmount == null ? null : ruleAmount.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public Long getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Long createUserid) {
        this.createUserid = createUserid;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.math.BigDecimal;

public class GiftMoneyTemplateRule {
    private Long ruleId;

    private Long templateId;

    private Long ruleAmount;

    private BigDecimal amount;

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getRuleAmount() {
        return ruleAmount;
    }

    public void setRuleAmount(Long ruleAmount) {
        this.ruleAmount = ruleAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.math.BigDecimal;

public class CommonBankInfo {
    private Integer bankId;

    private String bankCode;

    private String e3rdpayno;

    private String bankName;

    private Boolean orderMode;

    private Boolean supportCardType;

    private BigDecimal payLimit;

    private Boolean serveFee;

    private BigDecimal feeRate;

    private Boolean riskLevel;

    private Boolean notifyMode;

    private Boolean notifyScope;

    private Boolean isSafeinf;

    private String bankTestRequestUrl;

    private String bankRequestUrl;

    private String bankLogo;

    private Boolean level;

    private Boolean isShow;

    private Boolean state;

    private String cardPurpose;

    private String cardUnionYn;

    private String interBankTransferYn;

    private String publicPrivateTag;

    private String supportWithholdingYn;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getE3rdpayno() {
        return e3rdpayno;
    }

    public void setE3rdpayno(String e3rdpayno) {
        this.e3rdpayno = e3rdpayno == null ? null : e3rdpayno.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Boolean getOrderMode() {
        return orderMode;
    }

    public void setOrderMode(Boolean orderMode) {
        this.orderMode = orderMode;
    }

    public Boolean getSupportCardType() {
        return supportCardType;
    }

    public void setSupportCardType(Boolean supportCardType) {
        this.supportCardType = supportCardType;
    }

    public BigDecimal getPayLimit() {
        return payLimit;
    }

    public void setPayLimit(BigDecimal payLimit) {
        this.payLimit = payLimit;
    }

    public Boolean getServeFee() {
        return serveFee;
    }

    public void setServeFee(Boolean serveFee) {
        this.serveFee = serveFee;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public Boolean getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Boolean riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Boolean getNotifyMode() {
        return notifyMode;
    }

    public void setNotifyMode(Boolean notifyMode) {
        this.notifyMode = notifyMode;
    }

    public Boolean getNotifyScope() {
        return notifyScope;
    }

    public void setNotifyScope(Boolean notifyScope) {
        this.notifyScope = notifyScope;
    }

    public Boolean getIsSafeinf() {
        return isSafeinf;
    }

    public void setIsSafeinf(Boolean isSafeinf) {
        this.isSafeinf = isSafeinf;
    }

    public String getBankTestRequestUrl() {
        return bankTestRequestUrl;
    }

    public void setBankTestRequestUrl(String bankTestRequestUrl) {
        this.bankTestRequestUrl = bankTestRequestUrl == null ? null : bankTestRequestUrl.trim();
    }

    public String getBankRequestUrl() {
        return bankRequestUrl;
    }

    public void setBankRequestUrl(String bankRequestUrl) {
        this.bankRequestUrl = bankRequestUrl == null ? null : bankRequestUrl.trim();
    }

    public String getBankLogo() {
        return bankLogo;
    }

    public void setBankLogo(String bankLogo) {
        this.bankLogo = bankLogo == null ? null : bankLogo.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getCardPurpose() {
        return cardPurpose;
    }

    public void setCardPurpose(String cardPurpose) {
        this.cardPurpose = cardPurpose == null ? null : cardPurpose.trim();
    }

    public String getCardUnionYn() {
        return cardUnionYn;
    }

    public void setCardUnionYn(String cardUnionYn) {
        this.cardUnionYn = cardUnionYn == null ? null : cardUnionYn.trim();
    }

    public String getInterBankTransferYn() {
        return interBankTransferYn;
    }

    public void setInterBankTransferYn(String interBankTransferYn) {
        this.interBankTransferYn = interBankTransferYn == null ? null : interBankTransferYn.trim();
    }

    public String getPublicPrivateTag() {
        return publicPrivateTag;
    }

    public void setPublicPrivateTag(String publicPrivateTag) {
        this.publicPrivateTag = publicPrivateTag == null ? null : publicPrivateTag.trim();
    }

    public String getSupportWithholdingYn() {
        return supportWithholdingYn;
    }

    public void setSupportWithholdingYn(String supportWithholdingYn) {
        this.supportWithholdingYn = supportWithholdingYn == null ? null : supportWithholdingYn.trim();
    }
}
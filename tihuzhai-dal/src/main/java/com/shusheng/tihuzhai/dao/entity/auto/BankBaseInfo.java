package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class BankBaseInfo {
    private String bankCode;

    private String bankName;

    private Long withholdingAmount;

    private Long withdrawAmount;

    private Long dayWithholdingAmount;

    private String signedWay;

    private String isStop;

    private String logoUrl;

    private String memo;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Long getWithholdingAmount() {
        return withholdingAmount;
    }

    public void setWithholdingAmount(Long withholdingAmount) {
        this.withholdingAmount = withholdingAmount;
    }

    public Long getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Long getDayWithholdingAmount() {
        return dayWithholdingAmount;
    }

    public void setDayWithholdingAmount(Long dayWithholdingAmount) {
        this.dayWithholdingAmount = dayWithholdingAmount;
    }

    public String getSignedWay() {
        return signedWay;
    }

    public void setSignedWay(String signedWay) {
        this.signedWay = signedWay == null ? null : signedWay.trim();
    }

    public String getIsStop() {
        return isStop;
    }

    public void setIsStop(String isStop) {
        this.isStop = isStop == null ? null : isStop.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
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
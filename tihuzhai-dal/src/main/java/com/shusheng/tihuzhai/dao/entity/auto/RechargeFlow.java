package com.shusheng.tihuzhai.dao.entity.auto;

import java.math.BigDecimal;
import java.util.Date;

public class RechargeFlow {
    private Long flowId;

    private Long userId;

    private String yjfAccountId;

    private String userName;

    private String userRealName;

    private Long outUserId;

    private String outYjfAccountId;

    private String outUserName;

    private String outUserRealName;

    private String outBizNo;

    private String bankName;

    private String bankAccountNo;

    private String bankAcountName;

    private BigDecimal amount;

    private String payType;

    private String inOutType;

    private Date payTime;

    private Byte status;

    private String rem1;

    private String isTradeRedundancy;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getYjfAccountId() {
        return yjfAccountId;
    }

    public void setYjfAccountId(String yjfAccountId) {
        this.yjfAccountId = yjfAccountId == null ? null : yjfAccountId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public Long getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(Long outUserId) {
        this.outUserId = outUserId;
    }

    public String getOutYjfAccountId() {
        return outYjfAccountId;
    }

    public void setOutYjfAccountId(String outYjfAccountId) {
        this.outYjfAccountId = outYjfAccountId == null ? null : outYjfAccountId.trim();
    }

    public String getOutUserName() {
        return outUserName;
    }

    public void setOutUserName(String outUserName) {
        this.outUserName = outUserName == null ? null : outUserName.trim();
    }

    public String getOutUserRealName() {
        return outUserRealName;
    }

    public void setOutUserRealName(String outUserRealName) {
        this.outUserRealName = outUserRealName == null ? null : outUserRealName.trim();
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo == null ? null : outBizNo.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    public String getBankAcountName() {
        return bankAcountName;
    }

    public void setBankAcountName(String bankAcountName) {
        this.bankAcountName = bankAcountName == null ? null : bankAcountName.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getInOutType() {
        return inOutType;
    }

    public void setInOutType(String inOutType) {
        this.inOutType = inOutType == null ? null : inOutType.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRem1() {
        return rem1;
    }

    public void setRem1(String rem1) {
        this.rem1 = rem1 == null ? null : rem1.trim();
    }

    public String getIsTradeRedundancy() {
        return isTradeRedundancy;
    }

    public void setIsTradeRedundancy(String isTradeRedundancy) {
        this.isTradeRedundancy = isTradeRedundancy == null ? null : isTradeRedundancy.trim();
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
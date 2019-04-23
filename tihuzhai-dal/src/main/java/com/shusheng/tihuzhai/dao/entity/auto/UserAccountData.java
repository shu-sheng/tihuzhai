package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserAccountData {
    private Long userId;

    private Long userIntegral;

    private Long userIntegralGrandTotal;

    private Long userCouponCount;

    private Long userCouponCountGrandTotal;

    private Long userCouponAmount;

    private Long userCouponAmountGrandTotal;

    private Long userGiftAmount;

    private Long userGiftAmountGrandTotal;

    private Long userGiftAmountCount;

    private Long userGiftAmountGrandCount;

    private Long userGiftAmountCash;

    private Long userGiftAmountCashGrandTotal;

    private Long userGrowthValue;

    private Long userBalance;

    private Long userTradeAmount;

    private Long userRechargeAmount;

    private Long userWithdrawAmount;

    private Long userFreezeAmount;

    private Long userPayedAmount;

    private Long userTradeDay;

    private String lastTradeDay;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Long userIntegral) {
        this.userIntegral = userIntegral;
    }

    public Long getUserIntegralGrandTotal() {
        return userIntegralGrandTotal;
    }

    public void setUserIntegralGrandTotal(Long userIntegralGrandTotal) {
        this.userIntegralGrandTotal = userIntegralGrandTotal;
    }

    public Long getUserCouponCount() {
        return userCouponCount;
    }

    public void setUserCouponCount(Long userCouponCount) {
        this.userCouponCount = userCouponCount;
    }

    public Long getUserCouponCountGrandTotal() {
        return userCouponCountGrandTotal;
    }

    public void setUserCouponCountGrandTotal(Long userCouponCountGrandTotal) {
        this.userCouponCountGrandTotal = userCouponCountGrandTotal;
    }

    public Long getUserCouponAmount() {
        return userCouponAmount;
    }

    public void setUserCouponAmount(Long userCouponAmount) {
        this.userCouponAmount = userCouponAmount;
    }

    public Long getUserCouponAmountGrandTotal() {
        return userCouponAmountGrandTotal;
    }

    public void setUserCouponAmountGrandTotal(Long userCouponAmountGrandTotal) {
        this.userCouponAmountGrandTotal = userCouponAmountGrandTotal;
    }

    public Long getUserGiftAmount() {
        return userGiftAmount;
    }

    public void setUserGiftAmount(Long userGiftAmount) {
        this.userGiftAmount = userGiftAmount;
    }

    public Long getUserGiftAmountGrandTotal() {
        return userGiftAmountGrandTotal;
    }

    public void setUserGiftAmountGrandTotal(Long userGiftAmountGrandTotal) {
        this.userGiftAmountGrandTotal = userGiftAmountGrandTotal;
    }

    public Long getUserGiftAmountCount() {
        return userGiftAmountCount;
    }

    public void setUserGiftAmountCount(Long userGiftAmountCount) {
        this.userGiftAmountCount = userGiftAmountCount;
    }

    public Long getUserGiftAmountGrandCount() {
        return userGiftAmountGrandCount;
    }

    public void setUserGiftAmountGrandCount(Long userGiftAmountGrandCount) {
        this.userGiftAmountGrandCount = userGiftAmountGrandCount;
    }

    public Long getUserGiftAmountCash() {
        return userGiftAmountCash;
    }

    public void setUserGiftAmountCash(Long userGiftAmountCash) {
        this.userGiftAmountCash = userGiftAmountCash;
    }

    public Long getUserGiftAmountCashGrandTotal() {
        return userGiftAmountCashGrandTotal;
    }

    public void setUserGiftAmountCashGrandTotal(Long userGiftAmountCashGrandTotal) {
        this.userGiftAmountCashGrandTotal = userGiftAmountCashGrandTotal;
    }

    public Long getUserGrowthValue() {
        return userGrowthValue;
    }

    public void setUserGrowthValue(Long userGrowthValue) {
        this.userGrowthValue = userGrowthValue;
    }

    public Long getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Long userBalance) {
        this.userBalance = userBalance;
    }

    public Long getUserTradeAmount() {
        return userTradeAmount;
    }

    public void setUserTradeAmount(Long userTradeAmount) {
        this.userTradeAmount = userTradeAmount;
    }

    public Long getUserRechargeAmount() {
        return userRechargeAmount;
    }

    public void setUserRechargeAmount(Long userRechargeAmount) {
        this.userRechargeAmount = userRechargeAmount;
    }

    public Long getUserWithdrawAmount() {
        return userWithdrawAmount;
    }

    public void setUserWithdrawAmount(Long userWithdrawAmount) {
        this.userWithdrawAmount = userWithdrawAmount;
    }

    public Long getUserFreezeAmount() {
        return userFreezeAmount;
    }

    public void setUserFreezeAmount(Long userFreezeAmount) {
        this.userFreezeAmount = userFreezeAmount;
    }

    public Long getUserPayedAmount() {
        return userPayedAmount;
    }

    public void setUserPayedAmount(Long userPayedAmount) {
        this.userPayedAmount = userPayedAmount;
    }

    public Long getUserTradeDay() {
        return userTradeDay;
    }

    public void setUserTradeDay(Long userTradeDay) {
        this.userTradeDay = userTradeDay;
    }

    public String getLastTradeDay() {
        return lastTradeDay;
    }

    public void setLastTradeDay(String lastTradeDay) {
        this.lastTradeDay = lastTradeDay == null ? null : lastTradeDay.trim();
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
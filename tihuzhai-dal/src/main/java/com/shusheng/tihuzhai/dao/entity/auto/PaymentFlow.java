package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class PaymentFlow {
    private String paymentFlowId;

    private String orderNo;

    private Long paymentAmount;

    private Long userId;

    private String userName;

    private String realName;

    private String bankCode;

    private Date paymentDate;

    private Date paymentSuccessDate;

    private String paymentType;

    private String paymentMode;

    private String status;

    private String orderIds;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private Long redPay;

    private Long integralPay;

    private Long ticketAmount;

    private String refundStatus;

    private Long refundAmount;

    private Long ticketId;

    private String tradeNo;

    private String extOrder;

    private String extOrder1;

    private Long settleAmount;

    private String settleStatus;

    private String cardType;

    private String personalCorporateType;

    private Long merchantChargeAmount;

    private Long tradeAmountIn;

    private Long accountReceivable;

    public String getPaymentFlowId() {
        return paymentFlowId;
    }

    public void setPaymentFlowId(String paymentFlowId) {
        this.paymentFlowId = paymentFlowId == null ? null : paymentFlowId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getPaymentSuccessDate() {
        return paymentSuccessDate;
    }

    public void setPaymentSuccessDate(Date paymentSuccessDate) {
        this.paymentSuccessDate = paymentSuccessDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode == null ? null : paymentMode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds == null ? null : orderIds.trim();
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

    public Long getRedPay() {
        return redPay;
    }

    public void setRedPay(Long redPay) {
        this.redPay = redPay;
    }

    public Long getIntegralPay() {
        return integralPay;
    }

    public void setIntegralPay(Long integralPay) {
        this.integralPay = integralPay;
    }

    public Long getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(Long ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getExtOrder() {
        return extOrder;
    }

    public void setExtOrder(String extOrder) {
        this.extOrder = extOrder == null ? null : extOrder.trim();
    }

    public String getExtOrder1() {
        return extOrder1;
    }

    public void setExtOrder1(String extOrder1) {
        this.extOrder1 = extOrder1 == null ? null : extOrder1.trim();
    }

    public Long getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Long settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus == null ? null : settleStatus.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType == null ? null : personalCorporateType.trim();
    }

    public Long getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    public void setMerchantChargeAmount(Long merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }

    public Long getTradeAmountIn() {
        return tradeAmountIn;
    }

    public void setTradeAmountIn(Long tradeAmountIn) {
        this.tradeAmountIn = tradeAmountIn;
    }

    public Long getAccountReceivable() {
        return accountReceivable;
    }

    public void setAccountReceivable(Long accountReceivable) {
        this.accountReceivable = accountReceivable;
    }
}
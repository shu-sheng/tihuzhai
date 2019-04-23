package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblOrderInfo {
    private Long id;

    private Long buyCreditDetailId;

    private String creditStatus;

    private String province;

    private String city;

    private String county;

    private String detailAddress;

    private String drawerName;

    private String drawerNumber;

    private String drawerTel;

    private String zipCode;

    private String saleTypeO2o;

    private String saleTypeB2c;

    private String facade;

    private String specialExplain;

    private String paymentMethod;

    private String orderStatus;

    private String orderType;

    private Date createTime;

    private Long userId;

    private String buyerNickname;

    private Long operatorId;

    private Date operatorTime;

    private String areaCode;

    private String supplierName;

    private Long supplierId;

    private Long salePlatformId;

    private Long resortsBusinessId;

    private String resortsBusinessName;

    private String resortsBusinessRealName;

    private Long postFee;

    private String postType;

    private Long totalAmount;

    private String isPayed;

    private Date payedTime;

    private Date confirmReceiptTime;

    private String takeWays;

    private Long takegoodsId;

    private String workflowStatus;

    private String refundStatus;

    private String sellerMemo;

    private String sellerDelete;

    private String buyerDelete;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private Date groupPurchaseEndTime;

    private Date groupPurchaseBeginTime;

    private String delStatus;

    private String qrCode;

    private String sendStatus;

    private String validationStatus;

    private Date sendTime;

    private Date validationTime;

    private String orderNo;

    private String paymentFlowId;

    private Long gainMoney;

    private Long giftMoney;

    private Long userPoint;

    private Long userPointAmount;

    private Long batchNo;

    private String paymentWay;

    private Long addUpPay;

    private Long downPayment;

    private Long brokerageAmount;

    private Float firstPayAmount;

    private Long invoiceTaxAmount;

    private Long payCount;

    private String isInvoicing;

    private String isBuy;

    private String isSpecialOrders;

    private String specialOrdersUrl;

    private String isPointLogistics;

    private String logisticsCompanyName;

    private Long activityId;

    private String saleType;

    private String isNotice;

    private Date deliveryTime;

    private String traceCode;

    private Long sourceOrderId;

    private Long sourceSupplierId;

    private String isFreezing;

    private Long sourceOrderAmount;

    private Long platformServiceAmount;

    private Long payCommissionAmount;

    private String buyWays;

    private Long creditPayedAmount;

    private Long balancePayedAmount;

    private Long salesmanUserId;

    private Long remainderReceivables;

    private Long retractedMoney;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuyCreditDetailId() {
        return buyCreditDetailId;
    }

    public void setBuyCreditDetailId(Long buyCreditDetailId) {
        this.buyCreditDetailId = buyCreditDetailId;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus == null ? null : creditStatus.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName == null ? null : drawerName.trim();
    }

    public String getDrawerNumber() {
        return drawerNumber;
    }

    public void setDrawerNumber(String drawerNumber) {
        this.drawerNumber = drawerNumber == null ? null : drawerNumber.trim();
    }

    public String getDrawerTel() {
        return drawerTel;
    }

    public void setDrawerTel(String drawerTel) {
        this.drawerTel = drawerTel == null ? null : drawerTel.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getSaleTypeO2o() {
        return saleTypeO2o;
    }

    public void setSaleTypeO2o(String saleTypeO2o) {
        this.saleTypeO2o = saleTypeO2o == null ? null : saleTypeO2o.trim();
    }

    public String getSaleTypeB2c() {
        return saleTypeB2c;
    }

    public void setSaleTypeB2c(String saleTypeB2c) {
        this.saleTypeB2c = saleTypeB2c == null ? null : saleTypeB2c.trim();
    }

    public String getFacade() {
        return facade;
    }

    public void setFacade(String facade) {
        this.facade = facade == null ? null : facade.trim();
    }

    public String getSpecialExplain() {
        return specialExplain;
    }

    public void setSpecialExplain(String specialExplain) {
        this.specialExplain = specialExplain == null ? null : specialExplain.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBuyerNickname() {
        return buyerNickname;
    }

    public void setBuyerNickname(String buyerNickname) {
        this.buyerNickname = buyerNickname == null ? null : buyerNickname.trim();
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getSalePlatformId() {
        return salePlatformId;
    }

    public void setSalePlatformId(Long salePlatformId) {
        this.salePlatformId = salePlatformId;
    }

    public Long getResortsBusinessId() {
        return resortsBusinessId;
    }

    public void setResortsBusinessId(Long resortsBusinessId) {
        this.resortsBusinessId = resortsBusinessId;
    }

    public String getResortsBusinessName() {
        return resortsBusinessName;
    }

    public void setResortsBusinessName(String resortsBusinessName) {
        this.resortsBusinessName = resortsBusinessName == null ? null : resortsBusinessName.trim();
    }

    public String getResortsBusinessRealName() {
        return resortsBusinessRealName;
    }

    public void setResortsBusinessRealName(String resortsBusinessRealName) {
        this.resortsBusinessRealName = resortsBusinessRealName == null ? null : resortsBusinessRealName.trim();
    }

    public Long getPostFee() {
        return postFee;
    }

    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(String isPayed) {
        this.isPayed = isPayed == null ? null : isPayed.trim();
    }

    public Date getPayedTime() {
        return payedTime;
    }

    public void setPayedTime(Date payedTime) {
        this.payedTime = payedTime;
    }

    public Date getConfirmReceiptTime() {
        return confirmReceiptTime;
    }

    public void setConfirmReceiptTime(Date confirmReceiptTime) {
        this.confirmReceiptTime = confirmReceiptTime;
    }

    public String getTakeWays() {
        return takeWays;
    }

    public void setTakeWays(String takeWays) {
        this.takeWays = takeWays == null ? null : takeWays.trim();
    }

    public Long getTakegoodsId() {
        return takegoodsId;
    }

    public void setTakegoodsId(Long takegoodsId) {
        this.takegoodsId = takegoodsId;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus == null ? null : workflowStatus.trim();
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public String getSellerMemo() {
        return sellerMemo;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo == null ? null : sellerMemo.trim();
    }

    public String getSellerDelete() {
        return sellerDelete;
    }

    public void setSellerDelete(String sellerDelete) {
        this.sellerDelete = sellerDelete == null ? null : sellerDelete.trim();
    }

    public String getBuyerDelete() {
        return buyerDelete;
    }

    public void setBuyerDelete(String buyerDelete) {
        this.buyerDelete = buyerDelete == null ? null : buyerDelete.trim();
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

    public Date getGroupPurchaseEndTime() {
        return groupPurchaseEndTime;
    }

    public void setGroupPurchaseEndTime(Date groupPurchaseEndTime) {
        this.groupPurchaseEndTime = groupPurchaseEndTime;
    }

    public Date getGroupPurchaseBeginTime() {
        return groupPurchaseBeginTime;
    }

    public void setGroupPurchaseBeginTime(Date groupPurchaseBeginTime) {
        this.groupPurchaseBeginTime = groupPurchaseBeginTime;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus == null ? null : delStatus.trim();
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus == null ? null : validationStatus.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getValidationTime() {
        return validationTime;
    }

    public void setValidationTime(Date validationTime) {
        this.validationTime = validationTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getPaymentFlowId() {
        return paymentFlowId;
    }

    public void setPaymentFlowId(String paymentFlowId) {
        this.paymentFlowId = paymentFlowId == null ? null : paymentFlowId.trim();
    }

    public Long getGainMoney() {
        return gainMoney;
    }

    public void setGainMoney(Long gainMoney) {
        this.gainMoney = gainMoney;
    }

    public Long getGiftMoney() {
        return giftMoney;
    }

    public void setGiftMoney(Long giftMoney) {
        this.giftMoney = giftMoney;
    }

    public Long getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(Long userPoint) {
        this.userPoint = userPoint;
    }

    public Long getUserPointAmount() {
        return userPointAmount;
    }

    public void setUserPointAmount(Long userPointAmount) {
        this.userPointAmount = userPointAmount;
    }

    public Long getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay == null ? null : paymentWay.trim();
    }

    public Long getAddUpPay() {
        return addUpPay;
    }

    public void setAddUpPay(Long addUpPay) {
        this.addUpPay = addUpPay;
    }

    public Long getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Long downPayment) {
        this.downPayment = downPayment;
    }

    public Long getBrokerageAmount() {
        return brokerageAmount;
    }

    public void setBrokerageAmount(Long brokerageAmount) {
        this.brokerageAmount = brokerageAmount;
    }

    public Float getFirstPayAmount() {
        return firstPayAmount;
    }

    public void setFirstPayAmount(Float firstPayAmount) {
        this.firstPayAmount = firstPayAmount;
    }

    public Long getInvoiceTaxAmount() {
        return invoiceTaxAmount;
    }

    public void setInvoiceTaxAmount(Long invoiceTaxAmount) {
        this.invoiceTaxAmount = invoiceTaxAmount;
    }

    public Long getPayCount() {
        return payCount;
    }

    public void setPayCount(Long payCount) {
        this.payCount = payCount;
    }

    public String getIsInvoicing() {
        return isInvoicing;
    }

    public void setIsInvoicing(String isInvoicing) {
        this.isInvoicing = isInvoicing == null ? null : isInvoicing.trim();
    }

    public String getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(String isBuy) {
        this.isBuy = isBuy == null ? null : isBuy.trim();
    }

    public String getIsSpecialOrders() {
        return isSpecialOrders;
    }

    public void setIsSpecialOrders(String isSpecialOrders) {
        this.isSpecialOrders = isSpecialOrders == null ? null : isSpecialOrders.trim();
    }

    public String getSpecialOrdersUrl() {
        return specialOrdersUrl;
    }

    public void setSpecialOrdersUrl(String specialOrdersUrl) {
        this.specialOrdersUrl = specialOrdersUrl == null ? null : specialOrdersUrl.trim();
    }

    public String getIsPointLogistics() {
        return isPointLogistics;
    }

    public void setIsPointLogistics(String isPointLogistics) {
        this.isPointLogistics = isPointLogistics == null ? null : isPointLogistics.trim();
    }

    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName == null ? null : logisticsCompanyName.trim();
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    public String getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice == null ? null : isNotice.trim();
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getTraceCode() {
        return traceCode;
    }

    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode == null ? null : traceCode.trim();
    }

    public Long getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(Long sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
    }

    public Long getSourceSupplierId() {
        return sourceSupplierId;
    }

    public void setSourceSupplierId(Long sourceSupplierId) {
        this.sourceSupplierId = sourceSupplierId;
    }

    public String getIsFreezing() {
        return isFreezing;
    }

    public void setIsFreezing(String isFreezing) {
        this.isFreezing = isFreezing == null ? null : isFreezing.trim();
    }

    public Long getSourceOrderAmount() {
        return sourceOrderAmount;
    }

    public void setSourceOrderAmount(Long sourceOrderAmount) {
        this.sourceOrderAmount = sourceOrderAmount;
    }

    public Long getPlatformServiceAmount() {
        return platformServiceAmount;
    }

    public void setPlatformServiceAmount(Long platformServiceAmount) {
        this.platformServiceAmount = platformServiceAmount;
    }

    public Long getPayCommissionAmount() {
        return payCommissionAmount;
    }

    public void setPayCommissionAmount(Long payCommissionAmount) {
        this.payCommissionAmount = payCommissionAmount;
    }

    public String getBuyWays() {
        return buyWays;
    }

    public void setBuyWays(String buyWays) {
        this.buyWays = buyWays == null ? null : buyWays.trim();
    }

    public Long getCreditPayedAmount() {
        return creditPayedAmount;
    }

    public void setCreditPayedAmount(Long creditPayedAmount) {
        this.creditPayedAmount = creditPayedAmount;
    }

    public Long getBalancePayedAmount() {
        return balancePayedAmount;
    }

    public void setBalancePayedAmount(Long balancePayedAmount) {
        this.balancePayedAmount = balancePayedAmount;
    }

    public Long getSalesmanUserId() {
        return salesmanUserId;
    }

    public void setSalesmanUserId(Long salesmanUserId) {
        this.salesmanUserId = salesmanUserId;
    }

    public Long getRemainderReceivables() {
        return remainderReceivables;
    }

    public void setRemainderReceivables(Long remainderReceivables) {
        this.remainderReceivables = remainderReceivables;
    }

    public Long getRetractedMoney() {
        return retractedMoney;
    }

    public void setRetractedMoney(Long retractedMoney) {
        this.retractedMoney = retractedMoney;
    }
}
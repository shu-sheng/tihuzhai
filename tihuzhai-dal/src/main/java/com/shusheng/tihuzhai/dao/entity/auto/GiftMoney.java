package com.shusheng.tihuzhai.dao.entity.auto;

import java.math.BigDecimal;
import java.util.Date;

public class GiftMoney {
    private Long giftId;

    private String giftName;

    private String increase;

    private BigDecimal rateOfYear;

    private Long giftNum;

    private Long usedGiftNum;

    private Long personNum;

    private Long totalAmount;

    private Long amount;

    private Long usedAmount;

    private String giveType;

    private String type;

    private String useType;

    private String useAmount;

    private Date endDate;

    private Date startDate;

    private Date useStartDate;

    private Date useEndDate;

    private String status;

    private Long createUserid;

    private String createUsername;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String description;

    private String timeLimit;

    private String outbizno;

    private String loanBizType;

    private Long supplierId;

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public String getIncrease() {
        return increase;
    }

    public void setIncrease(String increase) {
        this.increase = increase == null ? null : increase.trim();
    }

    public BigDecimal getRateOfYear() {
        return rateOfYear;
    }

    public void setRateOfYear(BigDecimal rateOfYear) {
        this.rateOfYear = rateOfYear;
    }

    public Long getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Long giftNum) {
        this.giftNum = giftNum;
    }

    public Long getUsedGiftNum() {
        return usedGiftNum;
    }

    public void setUsedGiftNum(Long usedGiftNum) {
        this.usedGiftNum = usedGiftNum;
    }

    public Long getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Long personNum) {
        this.personNum = personNum;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(Long usedAmount) {
        this.usedAmount = usedAmount;
    }

    public String getGiveType() {
        return giveType;
    }

    public void setGiveType(String giveType) {
        this.giveType = giveType == null ? null : giveType.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    public String getUseAmount() {
        return useAmount;
    }

    public void setUseAmount(String useAmount) {
        this.useAmount = useAmount == null ? null : useAmount.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Date useStartDate) {
        this.useStartDate = useStartDate;
    }

    public Date getUseEndDate() {
        return useEndDate;
    }

    public void setUseEndDate(Date useEndDate) {
        this.useEndDate = useEndDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public String getOutbizno() {
        return outbizno;
    }

    public void setOutbizno(String outbizno) {
        this.outbizno = outbizno == null ? null : outbizno.trim();
    }

    public String getLoanBizType() {
        return loanBizType;
    }

    public void setLoanBizType(String loanBizType) {
        this.loanBizType = loanBizType == null ? null : loanBizType.trim();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
}
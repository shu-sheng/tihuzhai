package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserBankInfo {
    private Long id;

    private String userBaseId;

    private String bankCardNo;

    private String bankType;

    private String bankKey;

    private String bankProvince;

    private String bankCity;

    private String isDefault;

    private Integer bankOrder;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String isDel;

    private String pactno;

    private String bankAccountName;

    private String cardUseType;

    private String publicTag;

    private String approveStatus;

    private String certificationImgUrl;

    private String dismissedSuggestions;

    private String source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserBaseId() {
        return userBaseId;
    }

    public void setUserBaseId(String userBaseId) {
        this.userBaseId = userBaseId == null ? null : userBaseId.trim();
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public String getBankKey() {
        return bankKey;
    }

    public void setBankKey(String bankKey) {
        this.bankKey = bankKey == null ? null : bankKey.trim();
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public Integer getBankOrder() {
        return bankOrder;
    }

    public void setBankOrder(Integer bankOrder) {
        this.bankOrder = bankOrder;
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

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public String getPactno() {
        return pactno;
    }

    public void setPactno(String pactno) {
        this.pactno = pactno == null ? null : pactno.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getCardUseType() {
        return cardUseType;
    }

    public void setCardUseType(String cardUseType) {
        this.cardUseType = cardUseType == null ? null : cardUseType.trim();
    }

    public String getPublicTag() {
        return publicTag;
    }

    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag == null ? null : publicTag.trim();
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus == null ? null : approveStatus.trim();
    }

    public String getCertificationImgUrl() {
        return certificationImgUrl;
    }

    public void setCertificationImgUrl(String certificationImgUrl) {
        this.certificationImgUrl = certificationImgUrl == null ? null : certificationImgUrl.trim();
    }

    public String getDismissedSuggestions() {
        return dismissedSuggestions;
    }

    public void setDismissedSuggestions(String dismissedSuggestions) {
        this.dismissedSuggestions = dismissedSuggestions == null ? null : dismissedSuggestions.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}
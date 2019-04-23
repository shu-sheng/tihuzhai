package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserBaseInfo {
    private String userBaseId;

    private Long userId;

    private String userName;

    private String nickname;

    private String realName;

    private String logPassword;

    private String payPassword;

    private String accountId;

    private String accountName;

    private String mobile;

    private String mobileBinding;

    private String mail;

    private String mailBinding;

    private String type;

    private String state;

    private Date rowAddTime;

    private Date rowUpdateTime;

    private String identityName;

    private String identityStartNo;

    private String identityEndNo;

    private String exIdentityNo;

    private String realNameAuthentication;

    private Integer pwdErrorCount;

    private Date changeLockTime;

    private String userLevel;

    private Date userLevelValidityBegin;

    private Date userLevelValidityEnd;

    private String userRealStatus;

    private Integer certifyLevel;

    private String userProvince;

    private String userCounty;

    private String userCity;

    private String fixedPhone;

    private String zip;

    private String birthday;

    private String qq;

    private Long belongTo;

    private String userCustomType;

    private String userCustomType1;

    private String userCustomType2;

    private String enterpriseType;

    private String userRegisterFrom;

    private String appRegisterFrom;

    private String linkCode;

    private Long supplierId;

    private String isGenerationBuy;

    private Long praiseCount;

    private String qrCodePushStatus;

    private Long companyCustomerId;

    public String getUserBaseId() {
        return userBaseId;
    }

    public void setUserBaseId(String userBaseId) {
        this.userBaseId = userBaseId == null ? null : userBaseId.trim();
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getLogPassword() {
        return logPassword;
    }

    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword == null ? null : logPassword.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMobileBinding() {
        return mobileBinding;
    }

    public void setMobileBinding(String mobileBinding) {
        this.mobileBinding = mobileBinding == null ? null : mobileBinding.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getMailBinding() {
        return mailBinding;
    }

    public void setMailBinding(String mailBinding) {
        this.mailBinding = mailBinding == null ? null : mailBinding.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getRowAddTime() {
        return rowAddTime;
    }

    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName == null ? null : identityName.trim();
    }

    public String getIdentityStartNo() {
        return identityStartNo;
    }

    public void setIdentityStartNo(String identityStartNo) {
        this.identityStartNo = identityStartNo == null ? null : identityStartNo.trim();
    }

    public String getIdentityEndNo() {
        return identityEndNo;
    }

    public void setIdentityEndNo(String identityEndNo) {
        this.identityEndNo = identityEndNo == null ? null : identityEndNo.trim();
    }

    public String getExIdentityNo() {
        return exIdentityNo;
    }

    public void setExIdentityNo(String exIdentityNo) {
        this.exIdentityNo = exIdentityNo == null ? null : exIdentityNo.trim();
    }

    public String getRealNameAuthentication() {
        return realNameAuthentication;
    }

    public void setRealNameAuthentication(String realNameAuthentication) {
        this.realNameAuthentication = realNameAuthentication == null ? null : realNameAuthentication.trim();
    }

    public Integer getPwdErrorCount() {
        return pwdErrorCount;
    }

    public void setPwdErrorCount(Integer pwdErrorCount) {
        this.pwdErrorCount = pwdErrorCount;
    }

    public Date getChangeLockTime() {
        return changeLockTime;
    }

    public void setChangeLockTime(Date changeLockTime) {
        this.changeLockTime = changeLockTime;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public Date getUserLevelValidityBegin() {
        return userLevelValidityBegin;
    }

    public void setUserLevelValidityBegin(Date userLevelValidityBegin) {
        this.userLevelValidityBegin = userLevelValidityBegin;
    }

    public Date getUserLevelValidityEnd() {
        return userLevelValidityEnd;
    }

    public void setUserLevelValidityEnd(Date userLevelValidityEnd) {
        this.userLevelValidityEnd = userLevelValidityEnd;
    }

    public String getUserRealStatus() {
        return userRealStatus;
    }

    public void setUserRealStatus(String userRealStatus) {
        this.userRealStatus = userRealStatus == null ? null : userRealStatus.trim();
    }

    public Integer getCertifyLevel() {
        return certifyLevel;
    }

    public void setCertifyLevel(Integer certifyLevel) {
        this.certifyLevel = certifyLevel;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    public String getUserCounty() {
        return userCounty;
    }

    public void setUserCounty(String userCounty) {
        this.userCounty = userCounty == null ? null : userCounty.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone == null ? null : fixedPhone.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Long getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(Long belongTo) {
        this.belongTo = belongTo;
    }

    public String getUserCustomType() {
        return userCustomType;
    }

    public void setUserCustomType(String userCustomType) {
        this.userCustomType = userCustomType == null ? null : userCustomType.trim();
    }

    public String getUserCustomType1() {
        return userCustomType1;
    }

    public void setUserCustomType1(String userCustomType1) {
        this.userCustomType1 = userCustomType1 == null ? null : userCustomType1.trim();
    }

    public String getUserCustomType2() {
        return userCustomType2;
    }

    public void setUserCustomType2(String userCustomType2) {
        this.userCustomType2 = userCustomType2 == null ? null : userCustomType2.trim();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getUserRegisterFrom() {
        return userRegisterFrom;
    }

    public void setUserRegisterFrom(String userRegisterFrom) {
        this.userRegisterFrom = userRegisterFrom == null ? null : userRegisterFrom.trim();
    }

    public String getAppRegisterFrom() {
        return appRegisterFrom;
    }

    public void setAppRegisterFrom(String appRegisterFrom) {
        this.appRegisterFrom = appRegisterFrom == null ? null : appRegisterFrom.trim();
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode == null ? null : linkCode.trim();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getIsGenerationBuy() {
        return isGenerationBuy;
    }

    public void setIsGenerationBuy(String isGenerationBuy) {
        this.isGenerationBuy = isGenerationBuy == null ? null : isGenerationBuy.trim();
    }

    public Long getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Long praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getQrCodePushStatus() {
        return qrCodePushStatus;
    }

    public void setQrCodePushStatus(String qrCodePushStatus) {
        this.qrCodePushStatus = qrCodePushStatus == null ? null : qrCodePushStatus.trim();
    }

    public Long getCompanyCustomerId() {
        return companyCustomerId;
    }

    public void setCompanyCustomerId(Long companyCustomerId) {
        this.companyCustomerId = companyCustomerId;
    }
}
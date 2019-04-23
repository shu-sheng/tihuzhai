package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class CommonBranchInfo {
    private Integer id;

    private String bankLasalle;

    private String branchName;

    private String branchDistrictNo;

    private String bankId;

    private String branchBankFlag;

    private String userId;

    private String bankAdress;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankLasalle() {
        return bankLasalle;
    }

    public void setBankLasalle(String bankLasalle) {
        this.bankLasalle = bankLasalle == null ? null : bankLasalle.trim();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getBranchDistrictNo() {
        return branchDistrictNo;
    }

    public void setBranchDistrictNo(String branchDistrictNo) {
        this.branchDistrictNo = branchDistrictNo == null ? null : branchDistrictNo.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getBranchBankFlag() {
        return branchBankFlag;
    }

    public void setBranchBankFlag(String branchBankFlag) {
        this.branchBankFlag = branchBankFlag == null ? null : branchBankFlag.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress == null ? null : bankAdress.trim();
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
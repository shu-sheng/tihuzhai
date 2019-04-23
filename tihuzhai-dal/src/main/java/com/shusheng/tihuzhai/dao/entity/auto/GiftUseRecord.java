package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class GiftUseRecord {
    private Long tblBaseId;

    private String bizNumber;

    private String userName;

    private Long userId;

    private String giftName;

    private Date useTime;

    private Integer useAmount;

    private Byte status;

    private String note;

    public Long getTblBaseId() {
        return tblBaseId;
    }

    public void setTblBaseId(Long tblBaseId) {
        this.tblBaseId = tblBaseId;
    }

    public String getBizNumber() {
        return bizNumber;
    }

    public void setBizNumber(String bizNumber) {
        this.bizNumber = bizNumber == null ? null : bizNumber.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getUseAmount() {
        return useAmount;
    }

    public void setUseAmount(Integer useAmount) {
        this.useAmount = useAmount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}
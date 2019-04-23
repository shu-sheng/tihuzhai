package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class GiftInfo {
    private Long tblBaseId;

    private String giftName;

    private String giftCode;

    private String giftType;

    private Date startTime;

    private Date endTime;

    private String description;

    private Byte giftStatus;

    public Long getTblBaseId() {
        return tblBaseId;
    }

    public void setTblBaseId(Long tblBaseId) {
        this.tblBaseId = tblBaseId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode == null ? null : giftCode.trim();
    }

    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String giftType) {
        this.giftType = giftType == null ? null : giftType.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(Byte giftStatus) {
        this.giftStatus = giftStatus;
    }
}
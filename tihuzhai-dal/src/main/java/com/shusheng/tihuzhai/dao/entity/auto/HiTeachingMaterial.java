package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiTeachingMaterial {
    private Long id;

    private String teachingMaterialNo;

    private String teachingMaterialName;

    private Long teachingMaterialTypeId;

    private String teachingMaterialTypeName;

    private String sellPrice;

    private String teachingMaterialIcon;

    private String isRecommend;

    private String status;

    private String memo;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeachingMaterialNo() {
        return teachingMaterialNo;
    }

    public void setTeachingMaterialNo(String teachingMaterialNo) {
        this.teachingMaterialNo = teachingMaterialNo == null ? null : teachingMaterialNo.trim();
    }

    public String getTeachingMaterialName() {
        return teachingMaterialName;
    }

    public void setTeachingMaterialName(String teachingMaterialName) {
        this.teachingMaterialName = teachingMaterialName == null ? null : teachingMaterialName.trim();
    }

    public Long getTeachingMaterialTypeId() {
        return teachingMaterialTypeId;
    }

    public void setTeachingMaterialTypeId(Long teachingMaterialTypeId) {
        this.teachingMaterialTypeId = teachingMaterialTypeId;
    }

    public String getTeachingMaterialTypeName() {
        return teachingMaterialTypeName;
    }

    public void setTeachingMaterialTypeName(String teachingMaterialTypeName) {
        this.teachingMaterialTypeName = teachingMaterialTypeName == null ? null : teachingMaterialTypeName.trim();
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice == null ? null : sellPrice.trim();
    }

    public String getTeachingMaterialIcon() {
        return teachingMaterialIcon;
    }

    public void setTeachingMaterialIcon(String teachingMaterialIcon) {
        this.teachingMaterialIcon = teachingMaterialIcon == null ? null : teachingMaterialIcon.trim();
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend == null ? null : isRecommend.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
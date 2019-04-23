package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class PointsGoodsDetail {
    private Long pointsGoodsId;

    private Long pointsDetailId;

    private String deliveryCompany;

    private String billno;

    private String remarks;

    private Date addTime;

    private Date updateTime;

    public Long getPointsGoodsId() {
        return pointsGoodsId;
    }

    public void setPointsGoodsId(Long pointsGoodsId) {
        this.pointsGoodsId = pointsGoodsId;
    }

    public Long getPointsDetailId() {
        return pointsDetailId;
    }

    public void setPointsDetailId(Long pointsDetailId) {
        this.pointsDetailId = pointsDetailId;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblOrderItems {
    private Long id;

    private Long orderId;

    private Long itemProductId;

    private String itemProductName;

    private Long quantity;

    private Long proPrice;

    private String picPath;

    private Long postFree;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String unit;

    private String ptTag;

    private Long noShipmentAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getItemProductId() {
        return itemProductId;
    }

    public void setItemProductId(Long itemProductId) {
        this.itemProductId = itemProductId;
    }

    public String getItemProductName() {
        return itemProductName;
    }

    public void setItemProductName(String itemProductName) {
        this.itemProductName = itemProductName == null ? null : itemProductName.trim();
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getProPrice() {
        return proPrice;
    }

    public void setProPrice(Long proPrice) {
        this.proPrice = proPrice;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public Long getPostFree() {
        return postFree;
    }

    public void setPostFree(Long postFree) {
        this.postFree = postFree;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPtTag() {
        return ptTag;
    }

    public void setPtTag(String ptTag) {
        this.ptTag = ptTag == null ? null : ptTag.trim();
    }

    public Long getNoShipmentAmount() {
        return noShipmentAmount;
    }

    public void setNoShipmentAmount(Long noShipmentAmount) {
        this.noShipmentAmount = noShipmentAmount;
    }
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblShopCart {
    private Long id;

    private Long productId;

    private String productName;

    private String picPath;

    private Long price;

    private Long quantity;

    private Long totalPrice;

    private String isDelete;

    private Date putinDate;

    private Long userId;

    private Long supplierId;

    private String supplierName;

    private String productUnit;

    private String isBargain;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String userName;

    private String userNikename;

    private String ptTag;

    private String productSaleType;

    private String marketUnit;

    private Long productMarketScale;

    private Long productUnitId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Date getPutinDate() {
        return putinDate;
    }

    public void setPutinDate(Date putinDate) {
        this.putinDate = putinDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public String getIsBargain() {
        return isBargain;
    }

    public void setIsBargain(String isBargain) {
        this.isBargain = isBargain == null ? null : isBargain.trim();
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNikename() {
        return userNikename;
    }

    public void setUserNikename(String userNikename) {
        this.userNikename = userNikename == null ? null : userNikename.trim();
    }

    public String getPtTag() {
        return ptTag;
    }

    public void setPtTag(String ptTag) {
        this.ptTag = ptTag == null ? null : ptTag.trim();
    }

    public String getProductSaleType() {
        return productSaleType;
    }

    public void setProductSaleType(String productSaleType) {
        this.productSaleType = productSaleType == null ? null : productSaleType.trim();
    }

    public String getMarketUnit() {
        return marketUnit;
    }

    public void setMarketUnit(String marketUnit) {
        this.marketUnit = marketUnit == null ? null : marketUnit.trim();
    }

    public Long getProductMarketScale() {
        return productMarketScale;
    }

    public void setProductMarketScale(Long productMarketScale) {
        this.productMarketScale = productMarketScale;
    }

    public Long getProductUnitId() {
        return productUnitId;
    }

    public void setProductUnitId(Long productUnitId) {
        this.productUnitId = productUnitId;
    }
}
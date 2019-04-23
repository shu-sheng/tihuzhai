package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblProductLike {
    private Long productLikeId;

    private Long productId;

    private String userIp;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getProductLikeId() {
        return productLikeId;
    }

    public void setProductLikeId(Long productLikeId) {
        this.productLikeId = productLikeId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
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
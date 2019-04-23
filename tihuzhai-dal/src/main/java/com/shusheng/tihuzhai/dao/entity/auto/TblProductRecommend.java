package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblProductRecommend {
    private Long productRecommendId;

    private Long productId;

    private Long userId;

    private String recommendType;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getProductRecommendId() {
        return productRecommendId;
    }

    public void setProductRecommendId(Long productRecommendId) {
        this.productRecommendId = productRecommendId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(String recommendType) {
        this.recommendType = recommendType == null ? null : recommendType.trim();
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
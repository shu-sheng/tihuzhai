package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblDeliver {
    private Long deliverId;

    private Long productId;

    private Long post;

    private Long express;

    private Long ems;

    private String postArea;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String type;

    public Long getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getPost() {
        return post;
    }

    public void setPost(Long post) {
        this.post = post;
    }

    public Long getExpress() {
        return express;
    }

    public void setExpress(Long express) {
        this.express = express;
    }

    public Long getEms() {
        return ems;
    }

    public void setEms(Long ems) {
        this.ems = ems;
    }

    public String getPostArea() {
        return postArea;
    }

    public void setPostArea(String postArea) {
        this.postArea = postArea == null ? null : postArea.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
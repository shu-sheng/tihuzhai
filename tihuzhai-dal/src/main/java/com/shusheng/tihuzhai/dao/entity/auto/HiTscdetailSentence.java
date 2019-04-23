package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiTscdetailSentence {
    private Long id;

    private Long tscDetailId;

    private Integer sentenceOrder;

    private Long sentenceId;

    private String status;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTscDetailId() {
        return tscDetailId;
    }

    public void setTscDetailId(Long tscDetailId) {
        this.tscDetailId = tscDetailId;
    }

    public Integer getSentenceOrder() {
        return sentenceOrder;
    }

    public void setSentenceOrder(Integer sentenceOrder) {
        this.sentenceOrder = sentenceOrder;
    }

    public Long getSentenceId() {
        return sentenceId;
    }

    public void setSentenceId(Long sentenceId) {
        this.sentenceId = sentenceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
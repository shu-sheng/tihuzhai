package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiPronounce {
    private Long id;

    private Long firstTeachingMaterialTypeId;

    private String firstTeachingMaterialTypeName;

    private Long secondTeachingMaterialTypeId;

    private String secondTeachingMaterialTypeName;

    private Integer pageNo;

    private String title;

    private String memo;

    private String status;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFirstTeachingMaterialTypeId() {
        return firstTeachingMaterialTypeId;
    }

    public void setFirstTeachingMaterialTypeId(Long firstTeachingMaterialTypeId) {
        this.firstTeachingMaterialTypeId = firstTeachingMaterialTypeId;
    }

    public String getFirstTeachingMaterialTypeName() {
        return firstTeachingMaterialTypeName;
    }

    public void setFirstTeachingMaterialTypeName(String firstTeachingMaterialTypeName) {
        this.firstTeachingMaterialTypeName = firstTeachingMaterialTypeName == null ? null : firstTeachingMaterialTypeName.trim();
    }

    public Long getSecondTeachingMaterialTypeId() {
        return secondTeachingMaterialTypeId;
    }

    public void setSecondTeachingMaterialTypeId(Long secondTeachingMaterialTypeId) {
        this.secondTeachingMaterialTypeId = secondTeachingMaterialTypeId;
    }

    public String getSecondTeachingMaterialTypeName() {
        return secondTeachingMaterialTypeName;
    }

    public void setSecondTeachingMaterialTypeName(String secondTeachingMaterialTypeName) {
        this.secondTeachingMaterialTypeName = secondTeachingMaterialTypeName == null ? null : secondTeachingMaterialTypeName.trim();
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
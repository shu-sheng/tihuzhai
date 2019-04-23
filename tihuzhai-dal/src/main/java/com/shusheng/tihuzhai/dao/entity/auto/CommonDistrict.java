package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class CommonDistrict {
    private Integer id;

    private String nbNo;

    private String fatherNo;

    private String areaName;

    private String shortName;

    private String areaPy;

    private String areaNagda;

    private String cnaps;

    private String userId;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNbNo() {
        return nbNo;
    }

    public void setNbNo(String nbNo) {
        this.nbNo = nbNo == null ? null : nbNo.trim();
    }

    public String getFatherNo() {
        return fatherNo;
    }

    public void setFatherNo(String fatherNo) {
        this.fatherNo = fatherNo == null ? null : fatherNo.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getAreaPy() {
        return areaPy;
    }

    public void setAreaPy(String areaPy) {
        this.areaPy = areaPy == null ? null : areaPy.trim();
    }

    public String getAreaNagda() {
        return areaNagda;
    }

    public void setAreaNagda(String areaNagda) {
        this.areaNagda = areaNagda == null ? null : areaNagda.trim();
    }

    public String getCnaps() {
        return cnaps;
    }

    public void setCnaps(String cnaps) {
        this.cnaps = cnaps == null ? null : cnaps.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class SysParam {
    private String paramName;

    private String paramValue;

    private String extendAttributeOne;

    private String extendAttributeTwo;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String description;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getExtendAttributeOne() {
        return extendAttributeOne;
    }

    public void setExtendAttributeOne(String extendAttributeOne) {
        this.extendAttributeOne = extendAttributeOne == null ? null : extendAttributeOne.trim();
    }

    public String getExtendAttributeTwo() {
        return extendAttributeTwo;
    }

    public void setExtendAttributeTwo(String extendAttributeTwo) {
        this.extendAttributeTwo = extendAttributeTwo == null ? null : extendAttributeTwo.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
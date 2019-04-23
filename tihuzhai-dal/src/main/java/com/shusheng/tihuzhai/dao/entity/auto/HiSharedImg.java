package com.shusheng.tihuzhai.dao.entity.auto;

public class HiSharedImg {
    private Long id;

    private String countryCode;

    private String counttyName;

    private String sharedType;

    private String imgUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getCounttyName() {
        return counttyName;
    }

    public void setCounttyName(String counttyName) {
        this.counttyName = counttyName == null ? null : counttyName.trim();
    }

    public String getSharedType() {
        return sharedType;
    }

    public void setSharedType(String sharedType) {
        this.sharedType = sharedType == null ? null : sharedType.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}
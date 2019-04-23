package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class FileElecCertificate {
    private String fileKey;

    private String preservationId;

    private String dochash;

    private String link;

    private Date rawAddTime;

    private Date preservationTime;

    private Date linkExpireTime;

    private String localLink;

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey == null ? null : fileKey.trim();
    }

    public String getPreservationId() {
        return preservationId;
    }

    public void setPreservationId(String preservationId) {
        this.preservationId = preservationId == null ? null : preservationId.trim();
    }

    public String getDochash() {
        return dochash;
    }

    public void setDochash(String dochash) {
        this.dochash = dochash == null ? null : dochash.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getPreservationTime() {
        return preservationTime;
    }

    public void setPreservationTime(Date preservationTime) {
        this.preservationTime = preservationTime;
    }

    public Date getLinkExpireTime() {
        return linkExpireTime;
    }

    public void setLinkExpireTime(Date linkExpireTime) {
        this.linkExpireTime = linkExpireTime;
    }

    public String getLocalLink() {
        return localLink;
    }

    public void setLocalLink(String localLink) {
        this.localLink = localLink == null ? null : localLink.trim();
    }
}
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class CommonAttachment {
    private Long attachmentId;

    private String bizNo;

    private String moduleType;

    private String checkStatus;

    private String fileName;

    private Long isort;

    private String filePhysicalPath;

    private String requestPath;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Long getIsort() {
        return isort;
    }

    public void setIsort(Long isort) {
        this.isort = isort;
    }

    public String getFilePhysicalPath() {
        return filePhysicalPath;
    }

    public void setFilePhysicalPath(String filePhysicalPath) {
        this.filePhysicalPath = filePhysicalPath == null ? null : filePhysicalPath.trim();
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath == null ? null : requestPath.trim();
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
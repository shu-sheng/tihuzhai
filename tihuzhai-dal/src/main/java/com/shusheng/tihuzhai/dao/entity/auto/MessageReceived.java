package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class MessageReceived {
    private Long receivedId;

    private Long messageId;

    private String messageTitle;

    private String messageType;

    private String messageSubject;

    private String notificationObject;

    private String viewType;

    private String linkUrl;

    private Date messageReceivedDate;

    private Long messageSenderId;

    private String messageReceivedName;

    private Long messageReceivedId;

    private String messageReceivedStatus;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String messageContent;

    public Long getReceivedId() {
        return receivedId;
    }

    public void setReceivedId(Long receivedId) {
        this.receivedId = receivedId;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject == null ? null : messageSubject.trim();
    }

    public String getNotificationObject() {
        return notificationObject;
    }

    public void setNotificationObject(String notificationObject) {
        this.notificationObject = notificationObject == null ? null : notificationObject.trim();
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType == null ? null : viewType.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public Date getMessageReceivedDate() {
        return messageReceivedDate;
    }

    public void setMessageReceivedDate(Date messageReceivedDate) {
        this.messageReceivedDate = messageReceivedDate;
    }

    public Long getMessageSenderId() {
        return messageSenderId;
    }

    public void setMessageSenderId(Long messageSenderId) {
        this.messageSenderId = messageSenderId;
    }

    public String getMessageReceivedName() {
        return messageReceivedName;
    }

    public void setMessageReceivedName(String messageReceivedName) {
        this.messageReceivedName = messageReceivedName == null ? null : messageReceivedName.trim();
    }

    public Long getMessageReceivedId() {
        return messageReceivedId;
    }

    public void setMessageReceivedId(Long messageReceivedId) {
        this.messageReceivedId = messageReceivedId;
    }

    public String getMessageReceivedStatus() {
        return messageReceivedStatus;
    }

    public void setMessageReceivedStatus(String messageReceivedStatus) {
        this.messageReceivedStatus = messageReceivedStatus == null ? null : messageReceivedStatus.trim();
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

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}
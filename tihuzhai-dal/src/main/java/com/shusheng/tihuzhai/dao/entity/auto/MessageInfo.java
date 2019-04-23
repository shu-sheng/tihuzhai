package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class MessageInfo {
    private Long messageId;

    private String messageTitle;

    private String messageType;

    private String messageStatus;

    private String messageSubject;

    private String notificationObject;

    private String linkUrl;

    private String viewType;

    private String notificationType;

    private Date messageSendDate;

    private Date messagePlanSendDate;

    private Long messageSenderId;

    private String messageSenderName;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String delStatus;

    private String messageContent;

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

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus == null ? null : messageStatus.trim();
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

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType == null ? null : viewType.trim();
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType == null ? null : notificationType.trim();
    }

    public Date getMessageSendDate() {
        return messageSendDate;
    }

    public void setMessageSendDate(Date messageSendDate) {
        this.messageSendDate = messageSendDate;
    }

    public Date getMessagePlanSendDate() {
        return messagePlanSendDate;
    }

    public void setMessagePlanSendDate(Date messagePlanSendDate) {
        this.messagePlanSendDate = messagePlanSendDate;
    }

    public Long getMessageSenderId() {
        return messageSenderId;
    }

    public void setMessageSenderId(Long messageSenderId) {
        this.messageSenderId = messageSenderId;
    }

    public String getMessageSenderName() {
        return messageSenderName;
    }

    public void setMessageSenderName(String messageSenderName) {
        this.messageSenderName = messageSenderName == null ? null : messageSenderName.trim();
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

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus == null ? null : delStatus.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}
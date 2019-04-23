package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiUserDialogueTesting {
    private Long id;

    private Long userId;

    private Long testingDetailId;

    private String userAnswer;

    private String isCorrect;

    private String userVoiceUrl;

    private Integer voiceScore;

    private String memo;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTestingDetailId() {
        return testingDetailId;
    }

    public void setTestingDetailId(Long testingDetailId) {
        this.testingDetailId = testingDetailId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }

    public String getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(String isCorrect) {
        this.isCorrect = isCorrect == null ? null : isCorrect.trim();
    }

    public String getUserVoiceUrl() {
        return userVoiceUrl;
    }

    public void setUserVoiceUrl(String userVoiceUrl) {
        this.userVoiceUrl = userVoiceUrl == null ? null : userVoiceUrl.trim();
    }

    public Integer getVoiceScore() {
        return voiceScore;
    }

    public void setVoiceScore(Integer voiceScore) {
        this.voiceScore = voiceScore;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
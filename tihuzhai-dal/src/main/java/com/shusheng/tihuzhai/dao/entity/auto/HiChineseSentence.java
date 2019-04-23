package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiChineseSentence {
    private Long id;

    private String chineseSentence;

    private String sentencePinYin;

    private String voiceUrl;

    private String status;

    private String memo;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChineseSentence() {
        return chineseSentence;
    }

    public void setChineseSentence(String chineseSentence) {
        this.chineseSentence = chineseSentence == null ? null : chineseSentence.trim();
    }

    public String getSentencePinYin() {
        return sentencePinYin;
    }

    public void setSentencePinYin(String sentencePinYin) {
        this.sentencePinYin = sentencePinYin == null ? null : sentencePinYin.trim();
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl == null ? null : voiceUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
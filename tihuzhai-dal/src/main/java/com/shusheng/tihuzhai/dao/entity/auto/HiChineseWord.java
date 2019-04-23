package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiChineseWord {
    private Long id;

    private Long typeId;

    private String teachingMaterialFirstType;

    private Integer pageNo;

    private String word;

    private String pinYin;

    private String firstCharacter;

    private String chineseVideoUrl;

    private String koreanVideoUrl;

    private String englishVideoUrl;

    private String japaneseVideoUrl;

    private String voiceUrl;

    private String wordImg;

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

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTeachingMaterialFirstType() {
        return teachingMaterialFirstType;
    }

    public void setTeachingMaterialFirstType(String teachingMaterialFirstType) {
        this.teachingMaterialFirstType = teachingMaterialFirstType == null ? null : teachingMaterialFirstType.trim();
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getPinYin() {
        return pinYin;
    }

    public void setPinYin(String pinYin) {
        this.pinYin = pinYin == null ? null : pinYin.trim();
    }

    public String getFirstCharacter() {
        return firstCharacter;
    }

    public void setFirstCharacter(String firstCharacter) {
        this.firstCharacter = firstCharacter == null ? null : firstCharacter.trim();
    }

    public String getChineseVideoUrl() {
        return chineseVideoUrl;
    }

    public void setChineseVideoUrl(String chineseVideoUrl) {
        this.chineseVideoUrl = chineseVideoUrl == null ? null : chineseVideoUrl.trim();
    }

    public String getKoreanVideoUrl() {
        return koreanVideoUrl;
    }

    public void setKoreanVideoUrl(String koreanVideoUrl) {
        this.koreanVideoUrl = koreanVideoUrl == null ? null : koreanVideoUrl.trim();
    }

    public String getEnglishVideoUrl() {
        return englishVideoUrl;
    }

    public void setEnglishVideoUrl(String englishVideoUrl) {
        this.englishVideoUrl = englishVideoUrl == null ? null : englishVideoUrl.trim();
    }

    public String getJapaneseVideoUrl() {
        return japaneseVideoUrl;
    }

    public void setJapaneseVideoUrl(String japaneseVideoUrl) {
        this.japaneseVideoUrl = japaneseVideoUrl == null ? null : japaneseVideoUrl.trim();
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl == null ? null : voiceUrl.trim();
    }

    public String getWordImg() {
        return wordImg;
    }

    public void setWordImg(String wordImg) {
        this.wordImg = wordImg == null ? null : wordImg.trim();
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
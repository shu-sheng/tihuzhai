package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiChineseCharacter {
    private Long id;

    private String chineseCharacter;

    private Integer tone;

    private String characterPinYin;

    private String firstLetter;

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

    public String getChineseCharacter() {
        return chineseCharacter;
    }

    public void setChineseCharacter(String chineseCharacter) {
        this.chineseCharacter = chineseCharacter == null ? null : chineseCharacter.trim();
    }

    public Integer getTone() {
        return tone;
    }

    public void setTone(Integer tone) {
        this.tone = tone;
    }

    public String getCharacterPinYin() {
        return characterPinYin;
    }

    public void setCharacterPinYin(String characterPinYin) {
        this.characterPinYin = characterPinYin == null ? null : characterPinYin.trim();
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter == null ? null : firstLetter.trim();
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
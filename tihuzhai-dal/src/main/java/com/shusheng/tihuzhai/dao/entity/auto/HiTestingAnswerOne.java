package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiTestingAnswerOne {
    private Long id;

    private Long testingQuestionId;

    private String answerTextOne;

    private String answerTextTwo;

    private String answerTextThree;

    private String answerTextFour;

    private String imgUrlOne;

    private String imgUrlTwo;

    private String imgUrlThree;

    private String imgUrlFour;

    private String voiceOne;

    private String voiceTwo;

    private String voiceThree;

    private String voiceFour;

    private String isCorrectAnswer;

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

    public Long getTestingQuestionId() {
        return testingQuestionId;
    }

    public void setTestingQuestionId(Long testingQuestionId) {
        this.testingQuestionId = testingQuestionId;
    }

    public String getAnswerTextOne() {
        return answerTextOne;
    }

    public void setAnswerTextOne(String answerTextOne) {
        this.answerTextOne = answerTextOne == null ? null : answerTextOne.trim();
    }

    public String getAnswerTextTwo() {
        return answerTextTwo;
    }

    public void setAnswerTextTwo(String answerTextTwo) {
        this.answerTextTwo = answerTextTwo == null ? null : answerTextTwo.trim();
    }

    public String getAnswerTextThree() {
        return answerTextThree;
    }

    public void setAnswerTextThree(String answerTextThree) {
        this.answerTextThree = answerTextThree == null ? null : answerTextThree.trim();
    }

    public String getAnswerTextFour() {
        return answerTextFour;
    }

    public void setAnswerTextFour(String answerTextFour) {
        this.answerTextFour = answerTextFour == null ? null : answerTextFour.trim();
    }

    public String getImgUrlOne() {
        return imgUrlOne;
    }

    public void setImgUrlOne(String imgUrlOne) {
        this.imgUrlOne = imgUrlOne == null ? null : imgUrlOne.trim();
    }

    public String getImgUrlTwo() {
        return imgUrlTwo;
    }

    public void setImgUrlTwo(String imgUrlTwo) {
        this.imgUrlTwo = imgUrlTwo == null ? null : imgUrlTwo.trim();
    }

    public String getImgUrlThree() {
        return imgUrlThree;
    }

    public void setImgUrlThree(String imgUrlThree) {
        this.imgUrlThree = imgUrlThree == null ? null : imgUrlThree.trim();
    }

    public String getImgUrlFour() {
        return imgUrlFour;
    }

    public void setImgUrlFour(String imgUrlFour) {
        this.imgUrlFour = imgUrlFour == null ? null : imgUrlFour.trim();
    }

    public String getVoiceOne() {
        return voiceOne;
    }

    public void setVoiceOne(String voiceOne) {
        this.voiceOne = voiceOne == null ? null : voiceOne.trim();
    }

    public String getVoiceTwo() {
        return voiceTwo;
    }

    public void setVoiceTwo(String voiceTwo) {
        this.voiceTwo = voiceTwo == null ? null : voiceTwo.trim();
    }

    public String getVoiceThree() {
        return voiceThree;
    }

    public void setVoiceThree(String voiceThree) {
        this.voiceThree = voiceThree == null ? null : voiceThree.trim();
    }

    public String getVoiceFour() {
        return voiceFour;
    }

    public void setVoiceFour(String voiceFour) {
        this.voiceFour = voiceFour == null ? null : voiceFour.trim();
    }

    public String getIsCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setIsCorrectAnswer(String isCorrectAnswer) {
        this.isCorrectAnswer = isCorrectAnswer == null ? null : isCorrectAnswer.trim();
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
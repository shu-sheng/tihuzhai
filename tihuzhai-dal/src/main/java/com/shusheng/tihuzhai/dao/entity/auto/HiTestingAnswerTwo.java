package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class HiTestingAnswerTwo {
    private Long id;

    private Long testingQuestionId;

    private Integer blankNo;

    private String answerContent;

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

    public Integer getBlankNo() {
        return blankNo;
    }

    public void setBlankNo(Integer blankNo) {
        this.blankNo = blankNo;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
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
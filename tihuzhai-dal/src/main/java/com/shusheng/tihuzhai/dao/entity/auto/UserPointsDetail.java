package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class UserPointsDetail {
    private Long pointsDetailId;

    private Long userId;

    private String valueType;

    private String pointsType;

    private String state;

    private String goods;

    private Long pointValue;

    private Long pointBalance;

    private Long consumerPointValue;

    private String source;

    private Long pointsRuleId;

    private String content;

    private String def1;

    private String def2;

    private String def3;

    private String outBizNo;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getPointsDetailId() {
        return pointsDetailId;
    }

    public void setPointsDetailId(Long pointsDetailId) {
        this.pointsDetailId = pointsDetailId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType == null ? null : valueType.trim();
    }

    public String getPointsType() {
        return pointsType;
    }

    public void setPointsType(String pointsType) {
        this.pointsType = pointsType == null ? null : pointsType.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    public Long getPointValue() {
        return pointValue;
    }

    public void setPointValue(Long pointValue) {
        this.pointValue = pointValue;
    }

    public Long getPointBalance() {
        return pointBalance;
    }

    public void setPointBalance(Long pointBalance) {
        this.pointBalance = pointBalance;
    }

    public Long getConsumerPointValue() {
        return consumerPointValue;
    }

    public void setConsumerPointValue(Long consumerPointValue) {
        this.consumerPointValue = consumerPointValue;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Long getPointsRuleId() {
        return pointsRuleId;
    }

    public void setPointsRuleId(Long pointsRuleId) {
        this.pointsRuleId = pointsRuleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo == null ? null : outBizNo.trim();
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
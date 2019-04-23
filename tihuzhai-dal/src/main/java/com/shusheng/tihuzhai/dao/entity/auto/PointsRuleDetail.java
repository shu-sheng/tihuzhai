package com.shusheng.tihuzhai.dao.entity.auto;

import java.math.BigDecimal;
import java.util.Date;

public class PointsRuleDetail {
    private Long pointsRuleDetailId;

    private Long pointsRuleId;

    private Long amount;

    private String userLevel;

    private Long priority;

    private BigDecimal coefficient;

    private Long pointsValue;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String def5;

    private String def6;

    private String def7;

    private String def8;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getPointsRuleDetailId() {
        return pointsRuleDetailId;
    }

    public void setPointsRuleDetailId(Long pointsRuleDetailId) {
        this.pointsRuleDetailId = pointsRuleDetailId;
    }

    public Long getPointsRuleId() {
        return pointsRuleId;
    }

    public void setPointsRuleId(Long pointsRuleId) {
        this.pointsRuleId = pointsRuleId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public BigDecimal getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(BigDecimal coefficient) {
        this.coefficient = coefficient;
    }

    public Long getPointsValue() {
        return pointsValue;
    }

    public void setPointsValue(Long pointsValue) {
        this.pointsValue = pointsValue;
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

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }

    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6 == null ? null : def6.trim();
    }

    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7 == null ? null : def7.trim();
    }

    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8 == null ? null : def8.trim();
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
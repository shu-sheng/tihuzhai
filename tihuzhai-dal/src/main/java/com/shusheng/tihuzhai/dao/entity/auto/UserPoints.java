package com.shusheng.tihuzhai.dao.entity.auto;

public class UserPoints {
    private Long userPointsId;

    private String userBaseId;

    private Long userId;

    private Long pointsTotal;

    private String state;

    public Long getUserPointsId() {
        return userPointsId;
    }

    public void setUserPointsId(Long userPointsId) {
        this.userPointsId = userPointsId;
    }

    public String getUserBaseId() {
        return userBaseId;
    }

    public void setUserBaseId(String userBaseId) {
        this.userBaseId = userBaseId == null ? null : userBaseId.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(Long pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}
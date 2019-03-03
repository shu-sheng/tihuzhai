package com.shusheng.tihuzhai.biz.admin.user.info;

import com.shusheng.tihuzhai.biz.base.MandarinOrderBase;

import java.util.Date;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/26 19:15
 */
public class UserInfo extends MandarinOrderBase {
    private static final long serialVersionUID = -1728609371204608432L;

    private Long id;

    private String userName;

    private String userRealName;

    private String password;

    private String email;

    private String mobile;

    private Integer passwordErrorTimes;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getPasswordErrorTimes() {
        return passwordErrorTimes;
    }

    public void setPasswordErrorTimes(Integer passwordErrorTimes) {
        this.passwordErrorTimes = passwordErrorTimes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", passwordErrorTimes=" + passwordErrorTimes +
                ", status='" + status + '\'' +
                ", memo='" + memo + '\'' +
                ", rawAddTime=" + rawAddTime +
                ", rawUpdateTime=" + rawUpdateTime +
                '}';
    }
}

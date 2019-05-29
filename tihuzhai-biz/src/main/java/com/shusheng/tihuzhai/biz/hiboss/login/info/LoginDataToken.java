package com.shusheng.tihuzhai.biz.hiboss.login.info;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/29 15:28
 */
public class LoginDataToken extends UsernamePasswordToken {

    private static final long serialVersionUID = 6295199072699314520L;

    private LoginData loginData;

    private boolean isValidate = true;
    UserInfo info;

    public void setLoginData(LoginData loginData) {
        this.loginData = loginData;
    }

    public LoginData getLoginData() {
        return loginData;
    }

    public boolean isValidate() {
        return this.isValidate;
    }

    public UserInfo getInfo() {
        return this.info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }

    public void setValidate(boolean isValidate) {
        this.isValidate = isValidate;
    }

    public LoginDataToken() {
    }

    public LoginDataToken(final LoginData loginData) {
        this(loginData, false, null);
    }

    public LoginDataToken(final LoginData loginData, final String host) {
        this(loginData, false, host);
    }

    public LoginDataToken(final LoginData loginData, final boolean rememberMe) {
        this(loginData, rememberMe, null);
    }

    public LoginDataToken(final LoginData loginData, final boolean rememberMe, final String host) {
        super(loginData.getUsername(), loginData.getPassword() != null ? loginData.getPassword()
                .toCharArray() : null, rememberMe, host);
        this.loginData = loginData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}

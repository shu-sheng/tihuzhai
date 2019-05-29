package com.shusheng.tihuzhai.biz.hiboss.login;

import com.shusheng.tihuzhai.biz.hiboss.login.info.LoginData;
import com.shusheng.tihuzhai.biz.hiboss.login.result.LoginResult;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/28 10:09
 */
public interface LoginService {

    /**
     * 密码登陆
     */
    public LoginResult login(LoginData loginData);

}

package com.shusheng.tihuzhai.biz.hiboss.login.impl;

import com.shusheng.tihuzhai.biz.hiboss.login.LoginService;
import com.shusheng.tihuzhai.biz.hiboss.login.info.LoginData;
import com.shusheng.tihuzhai.biz.hiboss.login.info.LoginDataToken;
import com.shusheng.tihuzhai.biz.hiboss.login.result.LoginResult;
import com.shusheng.tihuzhai.enums.StatusEnum;
import com.shusheng.tihuzhai.enums.TiHuZhaiResultEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/29 15:19
 */
@Service
public class LoginServiceImpl implements LoginService {

    private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    protected final static String SESSSION_KEY_LOGIN_RESULT = "SESSSION_KEY_LOGIN_RESULT";

    @Override
    public LoginResult login(LoginData loginData) {
        LoginResult result = new LoginResult();

        try {
            Subject currentUser = SecurityUtils.getSubject();
            LoginDataToken token = new LoginDataToken(loginData);
            currentUser.login(token);

            result.setSuccess(true);
            result.setDescription("登录校验成功");
            result.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
        }catch (Exception e) {
            result.setSuccess(false);
            result.setDescription("登录失败");
            result.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
        }
        return result;
    }
}

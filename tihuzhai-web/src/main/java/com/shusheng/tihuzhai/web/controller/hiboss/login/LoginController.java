package com.shusheng.tihuzhai.web.controller.hiboss.login;

import com.shusheng.tihuzhai.biz.hiboss.login.LoginService;
import com.shusheng.tihuzhai.biz.hiboss.login.info.LoginData;
import com.shusheng.tihuzhai.biz.hiboss.login.result.LoginResult;
import com.shusheng.tihuzhai.util.IPUtil;
import com.shusheng.tihuzhai.web.controller.shiro.MyShiroRealm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/26 17:07
 */
@Controller
@RequestMapping("/anon")
@Api(description = "管理后台：登录")
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Autowired
    LoginService loginService;

    @RequestMapping("/boss/login")
    @ApiOperation(value = "管理后台：帐号密码登录",httpMethod = "POST")
    private String backstageLogin(String userName, String logPassword, Model model,
                                  HttpSession session, HttpServletRequest request,
                                  HttpServletResponse response) {
        if (!StringUtils.isNotEmpty(userName)) {
            return "/hiboss/login/login.html";
        }
        LoginResult loginResult = doBossLogin(userName, logPassword,request);
        if (loginResult.getSuccess()) {
            sendUrl(response, "/admin/index.htm");
        }
        return null;
    }

    private LoginResult doBossLogin(String userName, String password,HttpServletRequest request) {
        try {
            logger.info("" + password);
        } catch (Exception e) {
            logger.error("密码解密异常---登录用户：" + userName, e);
        }
        LoginData orderData = new LoginData();
        orderData.setUsername(userName);
        orderData.setPassword(password);
        orderData.setIpAddress(IPUtil.getClientIp(request));
        LoginResult loginResult = loginService.login(orderData);
        return loginResult;
    }

    protected void sendUrl(HttpServletResponse response, String url) {
        try {
            response.sendRedirect(url);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

}

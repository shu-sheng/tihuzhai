package com.shusheng.tihuzhai.web.controller.hiboss.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/27 22:22
 */
@Controller
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value="/")
    public void homePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("这是我们的系统首页");
        String redirect = "/anon/boss/login";
        response.sendRedirect(redirect);
    }

}

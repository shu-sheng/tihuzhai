package com.shusheng.tihuzhai.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/27 22:22
 */
@RestController
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value="/")
    public String home() {
        log.info("这是我们的系统首页");
        return "这是我们第一个页面";
    }

    @RequestMapping(value="/toDemo")
    public String toDemo() {
        log.info("====>>跳转freemarker页面");
        return "Hello World";
    }

}

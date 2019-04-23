package com.shusheng.tihuzhai.web.controller.demo;

import com.shusheng.tihuzhai.biz.demo.TestExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/23 21:52
 */
@RestController
@RequestMapping("/test/exception")
public class TestExceptionController {
    @Autowired
    private TestExceptionService testExceptionService;

    @RequestMapping("/batchAdd")
    public String batchAdd(String username,String passwd) {
        testExceptionService.add();
        return "成功";
    }

    @RequestMapping("/404.do")
    public Object error_404() {
        return "你要找的页面，被eric偷吃了！";
    }

}

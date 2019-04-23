package com.shusheng.tihuzhai.web.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/23 18:39
 */
@Controller
@RequestMapping("/tpl")
public class TestThymeleafController {
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(ModelMap map) {
        // 设置属性
        map.addAttribute("name", "enjoy");
        // testThymeleaf：为模板文件的名称
        // 对应src/main/resources/templates/testThymeleaf.html
        return "testThymeleaf";
    }
}

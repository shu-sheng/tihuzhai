package com.shusheng.tihuzhai.web.controller.hiboss.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/29 15:53
 */
@Controller
@RequestMapping("/admin/")
public class IndexController {

    @RequestMapping("index.htm")
    public String backstageIdex(HttpServletRequest request, Model model) {
        return "/hiboss/index/index.html";
    }

}

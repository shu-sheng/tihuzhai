package com.shusheng.tihuzhai.web.controller.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/23 18:51
 */
@RestController
@RequestMapping(value="/swagger")
@Api(description = "测试：集成API可视化工具SWAGGER")
public class TestSwaggerController {

    @ApiOperation(value="获取用户信息", notes="根据id来获取用户详细信息")
    @ApiImplicitParam(name="id", value="用户ID", required=true, dataType="String")
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public Map<String,String> getInfo(@PathVariable String id) {
        Map<String ,String> map = new HashMap<String, String>();
        map.put("name", "lison");
        map.put("age", "38");
        return map;
    }

}

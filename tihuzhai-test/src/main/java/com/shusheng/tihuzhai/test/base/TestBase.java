package com.shusheng.tihuzhai.test.base;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/26 20:00
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestBase {

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

}

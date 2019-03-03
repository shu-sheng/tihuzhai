package com.shusheng.tihuzhai;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description
 * @Author Created by shusheng.
 * @Email shusheng@yiji.com
 * @Date 2017-01-17
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        if (System.getProperty("spring.profiles.active") == null) {
            System.setProperty("spring.profiles.active", "localhost");
        }

        SpringApplication.run(Main.class, args);

        if ("online".equals(System.getProperty("spring.profiles.active"))) {
            LoggerFactory.getLogger(SpringApplicationRunListener.class).info("启动成功: http://xxx.tihuzhai.com");
        } else {
            LoggerFactory.getLogger(SpringApplicationRunListener.class).info("启动成功: http://127.0.0.1:8899");
        }
        LoggerFactory.getLogger(SpringApplicationRunListener.class).info("当前环境:{}", System.getProperty("spring.profiles.active"));
    }

}

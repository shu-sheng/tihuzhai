package com.shusheng.tihuzhai;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author Created by shusheng.
 * @Email shusheng@yiji.com
 * @Date 2017-01-17
 */
@SpringBootApplication
@MapperScan("com.shusheng.tihuzhai.dao.mappers")
public class Main {

    public static void main(String[] args) {
        if (System.getProperty("spring.profiles.active") == null) {
            System.setProperty("spring.profiles.active", "localhost");
        }

        SpringApplication.run(Main.class, args);

        if ("localhost".equals(System.getProperty("spring.profiles.active"))) {
            LoggerFactory.getLogger(SpringApplicationRunListener.class).info("启动成功: http://127.0.0.1:8899");
        }
        LoggerFactory.getLogger(SpringApplicationRunListener.class).info("当前环境:{}", System.getProperty("spring.profiles.active"));
    }

}

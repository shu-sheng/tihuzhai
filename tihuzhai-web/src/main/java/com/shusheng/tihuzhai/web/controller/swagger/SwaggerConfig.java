package com.shusheng.tihuzhai.web.controller.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/23 18:44
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("全部接口")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shusheng.tihuzhai.web.controller"))// 指定扫描包下面的注解
                .paths(PathSelectors.any())
                .build();
    }

    // 创建api的基本信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("嗨中文")
                .description("集成SWAGGER构建RESTful APIs")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket createAdminRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("超级管理员操作接口")
                .apiInfo(adminApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shusheng.tihuzhai.web.controller.hiboss.admin"))// 指定扫描包下面的注解
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("嗨中文")
                .description("超级管理员操作API")
                .build();
    }

}

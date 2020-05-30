package com.dbs.ce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@MapperScan("com.dbs.ce.mapper")
@SpringBootApplication
public class CEApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(CEApplication.class, args);
    }

    //打包springboot项目
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
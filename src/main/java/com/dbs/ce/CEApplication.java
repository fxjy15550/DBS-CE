package com.dbs.ce;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
//@EnableSwaggerBootstrapUI
//@MapperScan("com.dbs.ce.mapper")
//@SpringBootApplication
//public class CEApplication extends SpringBootServletInitializer {
//    public static void main(String[] args) {
//        SpringApplication.run(CEApplication.class, args);
//    }
//
//    //为了打包springboot项目
//    @Override
//    protected SpringApplicationBuilder configure(
//            SpringApplicationBuilder builder) {
//        return builder.sources(this.getClass());
//    }
//}

@SpringBootApplication
@MapperScan("com.dbs.ce.mapper")//使用MapperScan批量扫描所有的Mapper接口；
public class CEApplication {

    public static void main(String[] args) {
        SpringApplication.run(CEApplication.class, args);
    }

}

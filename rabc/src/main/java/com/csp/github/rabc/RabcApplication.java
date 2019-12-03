package com.csp.github.rabc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 陈少平
 * @date 2019-11-16 15:02
 */
@SpringBootApplication
@MapperScan("com.csp.github.rabc.mapper")
public class RabcApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RabcApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
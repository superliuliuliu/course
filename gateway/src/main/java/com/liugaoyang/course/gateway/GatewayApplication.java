package com.liugaoyang.course.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * @author liugaoyang
 * @version 1.0.0
 * @description 网关启动类
 * @date 2020/7/12 17:50
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！");
        log.info("Gateway 地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
}


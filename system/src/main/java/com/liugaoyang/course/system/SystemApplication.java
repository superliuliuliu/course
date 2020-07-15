package com.liugaoyang.course.system;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;


@EnableEurekaClient
@SpringBootApplication
@Slf4j
@MapperScan(value = "com.liugaoyang.course.system.mapper")
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SystemApplication.class);
		Environment env = app.run(args).getEnvironment();
		log.info("启动成功！");
		log.info("System Client 地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}
}

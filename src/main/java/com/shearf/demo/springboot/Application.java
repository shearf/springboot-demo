package com.shearf.demo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity
//@MapperScan("com.shearf.demo.springboot.dal.mapper")
@PropertySources(value = {@PropertySource("classpath:my.properties"), @PropertySource("classpath:custom.properties")})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.application.bussiness.test.mapper") //扫描的mapper
@SpringBootApplication
public class LongDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LongDemoApplication.class, args);
	}

}

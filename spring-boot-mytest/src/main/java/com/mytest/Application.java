package com.mytest;

import com.mytest.config.EnableRegisterServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dupeng
 * @version V1.0
 * Copyright 2022 Kidswant Children Products Co., Ltd.
 * @Title: Application
 * @Description: TODO
 * @date 2024/1/25 23:11
 */
@SpringBootApplication
@EnableRegisterServer
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

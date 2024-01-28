package com.mytest.config;

import com.mytest.starter.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dupeng
 * @version V1.0
 * Copyright 2022 Kidswant Children Products Co., Ltd.
 * @Title: MyAutoConfiguration
 * @Description: TODO
 * @date 2024/1/28 9:26
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)
public class MyAutoConfiguration {
	static {
		System.out.println("init ....");
	}

	public SimpleBean simpleBean(){
		return new SimpleBean();
	}
}

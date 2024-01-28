package com.mytest.starter.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author dupeng
 * @version V1.0
 * Copyright 2022 Kidswant Children Products Co., Ltd.
 * @Title: SimpleBean
 * @Description: TODO
 * @date 2024/1/28 9:21
 */


@EnableConfigurationProperties
@ConfigurationProperties(prefix = "simplebean")
public class SimpleBean {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SimpleBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}

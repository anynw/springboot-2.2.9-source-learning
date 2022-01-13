package com.wuhp.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wuhp
 * @date 2022/1/13
 */
@EnableAutoConfiguration
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

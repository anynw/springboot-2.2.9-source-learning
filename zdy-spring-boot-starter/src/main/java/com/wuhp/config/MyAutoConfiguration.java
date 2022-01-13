package com.wuhp.config;

import com.wuhp.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuhp
 * @date 2022-1-13
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)
public class MyAutoConfiguration {
	static {
		System.out.println("MyAutoConfiguration init ......");
	}

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}
}

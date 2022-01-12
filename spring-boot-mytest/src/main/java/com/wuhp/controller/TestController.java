package com.wuhp.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhp
 * @date 2022/1/12
 */
@RestController
public class TestController {

	@RequestMapping("test")
	public String test() {
		System.out.println("springboot源码环境构建成功");
		return "springboot源码环境构建成功";
	}
}

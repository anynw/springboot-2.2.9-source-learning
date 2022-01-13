package com.wuhp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhp
 * @date 2022/1/14
 */
@RestController
public class TestController {

	@RequestMapping("/index")
	public String index() {
		String str = "SpringBoot源码部署成功";
		System.out.println(str);
		return str;
	}
}

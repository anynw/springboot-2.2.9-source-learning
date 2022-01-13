package com.wuhp;

import com.wuhp.annotation.EnableRegisterServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//springboot的主配置类
@EnableRegisterServer
public class SpringBootMyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyTestApplication.class, args);
	}

}

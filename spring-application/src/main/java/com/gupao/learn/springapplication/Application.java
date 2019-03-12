package com.gupao.learn.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 轩辚
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//一般方式的启动SpringBoot
		//SpringApplication.run(Application.class, args);

		//Fluent API方式启动SpringBoot
//		new SpringApplicationBuilder(Application.class)
//				.properties("server.port=8090")
//				.run();

		//一般方式实现Fluent API的功能
		SpringApplication application = new SpringApplication(Application.class);
		Map<String,Object> properties = new LinkedHashMap<>();
		properties.put("server.port",0);
		application.setDefaultProperties(properties);
		application.run();
	}

}

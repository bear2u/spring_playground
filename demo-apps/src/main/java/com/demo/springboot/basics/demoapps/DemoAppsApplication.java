package com.demo.springboot.basics.demoapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppsApplication {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext applicationContext = SpringApplication.run(DemoAppsApplication.class, args);
		
		for(String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}

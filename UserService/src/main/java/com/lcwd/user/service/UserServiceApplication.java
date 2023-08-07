package com.lcwd.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.client.RestTemplate;




//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class },
//scanBasePackages = {"com.lcwd.user.service.Controller", "com.lcwd.user.service.repositories",
//		"com.lcwd.user.service.serviceImpl","com.lcwd.user.service.entities"})
//@ComponentScan(basePackages="com.lcwd.user.service.repositories")


@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
@EnableFeignClients
public class UserServiceApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}

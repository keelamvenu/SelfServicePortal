package com.kmccorp.UIService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiServiceApplication.class, args);
	}

}

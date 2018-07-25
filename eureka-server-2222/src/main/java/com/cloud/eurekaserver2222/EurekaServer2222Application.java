package com.cloud.eurekaserver2222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2222Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer2222Application.class, args);
	}
}

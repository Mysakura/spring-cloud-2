package com.cloud.eurekaserver3333;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer3333Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer3333Application.class, args);
	}
}

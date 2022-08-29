package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServerAssesmentQ3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerAssesmentQ3Application.class, args);
	}

}

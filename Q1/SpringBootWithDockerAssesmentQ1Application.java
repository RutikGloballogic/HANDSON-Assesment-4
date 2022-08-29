package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWithDockerAssesmentQ1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithDockerAssesmentQ1Application.class, args);
	}

	@GetMapping("/hello")
	public String sayHello()

	 {

	 return "Welcome To Docker Application";

	 }
}

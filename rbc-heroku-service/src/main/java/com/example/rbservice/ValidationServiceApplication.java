package com.example.rbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.rbservice"})
public class ValidationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationServiceApplication.class, args);
	}
}

package com.sanchit.ecommerce_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sanchit.ecommerce_api")
public class EcommerceApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApiApplication.class, args);
	}
}
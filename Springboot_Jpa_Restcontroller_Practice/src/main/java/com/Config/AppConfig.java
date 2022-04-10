package com.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com"})
@EntityScan(basePackages = "com")
@EnableJpaRepositories(basePackages = "com")
public class AppConfig {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		SpringApplication.run(AppConfig.class, args);
		System.out.println("Main Ends");

	}

}

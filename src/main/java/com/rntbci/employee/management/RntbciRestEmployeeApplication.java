package com.rntbci.employee.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
@SpringBootApplication
public class RntbciRestEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RntbciRestEmployeeApplication.class, args);
		System.out.println("started");
	}
}

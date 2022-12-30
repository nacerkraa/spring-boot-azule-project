package com.kaido.employeeproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerApplication.class, args);
	}


}

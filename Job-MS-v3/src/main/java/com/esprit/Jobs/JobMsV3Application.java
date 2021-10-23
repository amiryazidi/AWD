package com.esprit.Jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JobMsV3Application {

	public static void main(String[] args) {
		SpringApplication.run(JobMsV3Application.class, args);
	}

}

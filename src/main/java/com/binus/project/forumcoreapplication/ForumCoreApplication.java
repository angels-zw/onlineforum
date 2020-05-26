package com.binus.project.forumcoreapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ForumCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumCoreApplication.class, args);
	}

}

package com.myownprojects.Task_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myownprojects")
public class TaskSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskSpringBootApplication.class, args);
	}

}

package com.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"com.cp.entity", "com.cp.controller", "com.cp.repository", "com.cp.bicycleService"})
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		
		//ถ้าอยู่คนละ packages ต้องเชื่อมด้วย componentScan ด้วย 
	}

}

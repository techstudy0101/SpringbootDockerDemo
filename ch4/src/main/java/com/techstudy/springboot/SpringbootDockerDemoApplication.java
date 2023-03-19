package com.techstudy.springboot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerDemoApplication {

	@Value("${spring.datasource.url}")
	String url;


	public static void main(String[] args) {

		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}


}

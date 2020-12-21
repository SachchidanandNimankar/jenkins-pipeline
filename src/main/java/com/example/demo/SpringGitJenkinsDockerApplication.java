package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.*")
@SpringBootApplication
public class SpringGitJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGitJenkinsDockerApplication.class, args);
	}

}

package com.kjrest.tres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories( basePackages = "com.kjrest.tres.repository")

@SpringBootApplication
public class TresApplication {

	public static void main(String[] args) {
		SpringApplication.run(TresApplication.class, args);
	}

}

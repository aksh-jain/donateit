package com.techmavericks.donateit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.techmavericks.donateit")
public class DonateitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonateitApplication.class, args);
	}
}

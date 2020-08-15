package com.proshoppe.applicationcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.proshoppe.controller" })
@EntityScan({ "com.proshoppe.model" })
@EnableJpaRepositories({ "com.proshoppe.dao" })
public class ProshoppeApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to spring boot");
		SpringApplication.run(ProshoppeApplication.class, args);
	}

}

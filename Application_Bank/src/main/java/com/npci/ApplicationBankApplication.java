package com.npci;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("customerProject")
public class ApplicationBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBankApplication.class, args);
	}

}

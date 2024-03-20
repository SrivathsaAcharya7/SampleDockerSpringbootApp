package com.sampledockerspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleDockerSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDockerSpringbootAppApplication.class, args);
		System.out.println("SampleApp Started");
	}

}

package com.example.demo;

import com.example.demo.roni.DemoClass;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void test(DemoClass demoClass) {
		System.out.println(demoClass);
	}
}

package com.example.ch05consumerhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class Ch05ConsumerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch05ConsumerHystrixApplication.class, args);
	}

}

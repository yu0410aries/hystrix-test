package com.example.ch05consumerhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class HelloController {

    RestTemplate restTemplate = new RestTemplate();

    @HystrixCommand(commandKey = "fallback", fallbackMethod = "hystrixFallBack")
    @GetMapping("/hystrix/{id}")
    public String hello(@PathVariable String id) {

        if (id.equals("1")) {
            throw new RuntimeException("test");
        }

        return id;
    }

    public String hystrixFallBack(@PathVariable String id) {
        return "hystrixFailBack";
    }

}

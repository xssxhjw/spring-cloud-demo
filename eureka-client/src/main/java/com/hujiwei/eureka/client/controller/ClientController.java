package com.hujiwei.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@GetMapping("/hello")
	public String sayHello(@Value("${spring.profiles}") String profiles) {
		return "hello form " + profiles;
	}
}

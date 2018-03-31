package com.hujiwei.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hujiwei.eureka.consumer.service.ConsumerService;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

	@GetMapping("/hi")
	public String sayHello() {
		return consumerService.sayHello();
	}
}

package com.hujiwei.eureka.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", fallback = ConsumerServiceHystrix.class)
public interface ConsumerService {
	@GetMapping("/hello")
	public String sayHello();
}

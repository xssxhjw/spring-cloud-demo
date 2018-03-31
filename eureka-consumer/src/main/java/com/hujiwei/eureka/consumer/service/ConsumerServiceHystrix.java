package com.hujiwei.eureka.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceHystrix implements ConsumerService {
    @Override
    public String sayHello() {
        return "error";
    }
}

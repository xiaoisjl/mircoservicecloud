package com.hui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient
public class DeptConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp.class, args);
    }
}

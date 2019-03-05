package com.hui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient
public class DeptProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApp.class, args);
    }
}

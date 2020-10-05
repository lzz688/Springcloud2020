package com.lzz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain_80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain_80.class,args);
    }
}

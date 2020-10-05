package com.lzz.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain_8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain_8006.class,args);
    }
}

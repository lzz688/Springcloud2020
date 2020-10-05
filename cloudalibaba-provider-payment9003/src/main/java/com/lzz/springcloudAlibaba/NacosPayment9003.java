package com.lzz.springcloudAlibaba;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayment9003 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPayment9003.class,args);
    }
}

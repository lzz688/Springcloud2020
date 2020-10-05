package com.lzz.springcloud.Config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced//赋予其负载均衡的能力，不配置的话会引起服务崩溃，无法找到准确服务
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}

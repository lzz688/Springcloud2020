package com.lzz.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderZkController {

    public static final String INVOLE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value ="/consumer/payment/zk")
    public String paymentinfo(){
        String result = restTemplate.getForObject(INVOLE_URL + "/payment/zk",String.class);

        return result;
    }
}

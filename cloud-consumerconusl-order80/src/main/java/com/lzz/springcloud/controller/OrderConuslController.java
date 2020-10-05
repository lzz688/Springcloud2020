package com.lzz.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
@Slf4j
public class OrderConuslController {

    public static final String INVOLE_URL = "http://conusl-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value ="/consumer/payment/consul")
    public String paymentinfo(){
        String result = restTemplate.getForObject(INVOLE_URL + "/payment/consul",String.class);

        return result;
    }
}

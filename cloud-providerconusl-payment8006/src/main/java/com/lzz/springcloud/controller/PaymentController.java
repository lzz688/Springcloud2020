package com.lzz.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverport;

    @RequestMapping(value = "/payment/consul")
    public String paymentzk(){
        return "springcloud with consul:"+serverport+"\t"+ UUID.randomUUID().toString();
    }
}

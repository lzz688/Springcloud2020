package com.lzz.springcloud.controller;


import com.lzz.springcloud.model.CommonResult;
import com.lzz.springcloud.model.Payment;
import com.lzz.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPatmentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String patmentFeignTimeout(){
        //openfeign-ribbon客户端一般默认1秒钟
        return paymentFeignService.patmentFeignTimeout();
    }
}

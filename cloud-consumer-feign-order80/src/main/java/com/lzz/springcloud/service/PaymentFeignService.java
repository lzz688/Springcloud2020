package com.lzz.springcloud.service;


import com.lzz.springcloud.model.CommonResult;
import com.lzz.springcloud.model.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")//填写微服务集群的名称,Feign回去服务注册中心去寻找
public interface PaymentFeignService {

    //payment8001的controller方法
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);//读操作

    @GetMapping(value = "/payment/feign/timeout")
    public String patmentFeignTimeout();//测试超时任务
}

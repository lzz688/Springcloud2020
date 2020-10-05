package com.lzz.springcloudAlibaba.controller;


import com.lzz.springcloudAlibaba.domain.CommonResult;
import com.lzz.springcloudAlibaba.domain.Order;
import com.lzz.springcloudAlibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController2001 {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}

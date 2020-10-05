package com.lzz.springcloudAlibaba.service;


import com.lzz.springcloudAlibaba.domain.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    void create(Order order);
}

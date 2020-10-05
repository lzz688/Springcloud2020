package com.lzz.springcloudAlibaba.service.impl;

import com.lzz.springcloudAlibaba.dao.OrderDao;
import com.lzz.springcloudAlibaba.domain.Order;
import com.lzz.springcloudAlibaba.service.AccountService;
import com.lzz.springcloudAlibaba.service.OrderService;
import com.lzz.springcloudAlibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceimpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @Override
    @GlobalTransactional(name="fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------>开始新建订单");
        orderDao.create(order);
        log.info("------>订单微服务开始调用库存，做扣减Count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("--------->订单微服务开始调用库存，做扣减end");

        log.info("--------->订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("--------->订单微服务开始调用账户，做扣减end");

        //修改订单状态
        log.info("--------->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("--------->修改订单状态结束");
    }
}

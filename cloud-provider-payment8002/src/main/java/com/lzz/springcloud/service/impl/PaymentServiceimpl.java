package com.lzz.springcloud.service.impl;

import com.lzz.springcloud.Dao.PaymentDao;
import com.lzz.springcloud.model.Payment;
import com.lzz.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceimpl implements PaymentService {

    @Resource//java自带的依赖注入
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

package com.lzz.springcloudalibaba.service;

import com.lzz.springcloud.model.CommonResult;
import com.lzz.springcloud.model.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackServiceimpl implements PaymentService84 {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，-----PaymentFallbackService",new Payment(id,"errorService"));
    }
}

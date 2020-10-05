package com.lzz.springcloudAlibaba.controller;


import com.lzz.springcloudAlibaba.domain.CommonResult;
import com.lzz.springcloudAlibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(Long userId, BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减库存成功!");
    }
}

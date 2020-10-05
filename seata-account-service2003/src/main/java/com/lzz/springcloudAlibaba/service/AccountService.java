package com.lzz.springcloudAlibaba.service;


import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;

public interface AccountService {

    public void decrease(@RequestParam("userId") Long productId,@RequestParam("money") BigDecimal money);
}

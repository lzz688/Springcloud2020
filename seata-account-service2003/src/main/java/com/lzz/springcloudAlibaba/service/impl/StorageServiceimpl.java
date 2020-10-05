package com.lzz.springcloudAlibaba.service.impl;

import com.lzz.springcloudAlibaba.dao.AccountDao;
import com.lzz.springcloudAlibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Service
public class StorageServiceimpl implements AccountService {

    private static final Logger LOGGER =LoggerFactory.getLogger(StorageServiceimpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("--------->storage-service中扣减账户余额开始");
        try{
            TimeUnit.SECONDS.sleep(20);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        accountDao.decrease(userId,money);
        LOGGER.info("--------->storage-service中扣减账户余额结束");
    }
}

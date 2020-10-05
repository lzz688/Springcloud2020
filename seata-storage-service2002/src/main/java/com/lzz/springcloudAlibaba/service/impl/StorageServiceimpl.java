package com.lzz.springcloudAlibaba.service.impl;

import com.lzz.springcloudAlibaba.dao.StorageDao;
import com.lzz.springcloudAlibaba.service.StorageService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.logging.Logger;

@Service
public class StorageServiceimpl implements StorageService {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(StorageServiceimpl.class);

    @Resource
    private StorageDao storageDao;


    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("--------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("--------->storage-service中扣减库存结束");
    }
}

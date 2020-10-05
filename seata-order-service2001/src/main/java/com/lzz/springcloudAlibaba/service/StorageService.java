package com.lzz.springcloudAlibaba.service;


import com.lzz.springcloudAlibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


//value指向库存微服务的名字,去调用服务
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    //商品ID,购买的数量
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}

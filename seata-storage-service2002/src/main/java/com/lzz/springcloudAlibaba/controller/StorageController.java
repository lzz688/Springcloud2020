package com.lzz.springcloudAlibaba.controller;


import com.lzz.springcloudAlibaba.domain.CommonResult;
import com.lzz.springcloudAlibaba.service.StorageService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功!");
    }
}

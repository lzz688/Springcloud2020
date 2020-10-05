package com.lzz.springcloudAlibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        //让进入的线程休眠0.8秒
        return "-------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName()+"\t"+"...testB");
        return "-------testB";
    }

    @GetMapping("/testD")
    public String testD(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE(){
        log.info("testD 测试异常比例");
        int a = 10/0;
        return "------testD";
    }

    @GetMapping("/testF")
    public String testF(){
        log.info("testD 测试异常数");
        int a = 10/0;
        return "------testD";
    }


    //热点数据限流
    @GetMapping("/testHotKey")
    //唯一标识，对Sentinel控制台负责，blockHandler指向异常时的兜底方法
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1" ,required = false) String p1,
                             @RequestParam(value = "p2" ,required = false) String p2){
        return "------hotKey";
    }

    //热点限流时兜底的异常方法
    public String deal_testHotKey(String p1, String p2, BlockException exception){

        return "-----deal_testHotKey,wuwuwuwuw";
    }
}

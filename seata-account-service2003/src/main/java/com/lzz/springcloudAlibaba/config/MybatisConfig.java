package com.lzz.springcloudAlibaba.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lzz.springcloudAlibaba.dao")
public class MybatisConfig {
}

package com.lzz.springcloudAlibaba.dao;

import com.lzz.springcloudAlibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDao{

    //新建订单
    void create(Order order);

    //修改订单状态
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}

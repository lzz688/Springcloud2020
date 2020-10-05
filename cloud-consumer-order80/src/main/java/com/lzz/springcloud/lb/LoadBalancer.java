package com.lzz.springcloud.lb;


import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

//自定义负载均衡算法
public interface LoadBalancer {

    //收集当前集群有多少台机器可用传入负载均衡算法中
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}

package com.lzz.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Component
public class MyLB implements LoadBalancer{

    //原子量
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;//当前的
        int next;//下一个的
        do {
            current = this.atomicInteger.get();
            //2147483647整型最大值，判断为false返回冒号后面的，true返回前面的
            next = current >= 2147483647 ? 0 : current + 1;

        }while (!this.atomicInteger.compareAndSet(current,next));//自旋锁操作，期望值是current，目标值是next
        System.out.println("******next:"+next);
        return next;
    }
    //rest接口第几次请求数%服务器集群总数量 = 实际调用服务器位置下标
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        //负载均衡算法计算
        int index = getAndIncrement() % serviceInstances.size();
        //返回被选中的实例
        return serviceInstances.get(index);
    }
}

package com.lzz.springcloud.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    /*
    * 配置了一个id为route-name的路由规则
    * 当访问地址http://localhost：9527/guonei时会自动转发网址http://news.baidu.com/guonei
    *
    * */
    @Bean
    public RouteLocator customRouteLocatorguonei(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_lzz",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"));

        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocatorguoji(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_lzz",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji"));

        return routes.build();
    }
}

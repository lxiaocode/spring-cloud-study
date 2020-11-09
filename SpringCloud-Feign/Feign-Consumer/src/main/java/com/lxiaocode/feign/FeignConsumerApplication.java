package com.lxiaocode.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午12:08
 * @blog http://www.lxiaocode.com/
 */
@EnableFeignClients     // 开启 Spring Cloud Feign 功能
@EnableDiscoveryClient  // 开启 服务发现 功能
@SpringBootApplication
public class FeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

    /**
     * Spring Cloud Feign
     * 功能：
     *      1. 封装了 Spring Cloud Ribbon 和 Spring Cloud Hystrix，简化开发。
     *      2. 提供了一种声明式的 Web 服务客户端定义方式。
     */
}

package com.lxiaocode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Eureka Client 在这里充当服务提供者
 * （通常 Eureka Client 既是服务提供者也是服务消费者，为了演示说明方便在这里仅充当服务消费者）
 * @author lixiaofeng
 * @date 2020/11/5 下午3:49
 * @blog http://www.lxiaocode.com/
 */
// 开启服务发现支持。这是通用的服务发现注解，适用与不同的服务发现框架。
// 相同作用的注解还有 @EnableEurekaClient 这是用于开启 Eureka 的服务发现支持。
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}

package com.lxiaocode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lixiaofeng
 * @date 2020/11/5 下午3:49
 * @blog http://www.lxiaocode.com/
 *
 * Eureka Client 在这里充当服务提供者
 * 通过服务发现功能，获取服务注册中心上的服务清单，以便调用服务。
 */
@EnableDiscoveryClient // 开启服务发现功能，或者使用 Eureka 专用的 @EnableEurekaClient 注解。
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}

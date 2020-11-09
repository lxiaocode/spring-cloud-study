package com.lxiaocode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lixiaofeng
 * @date 2020/11/8 下午11:40
 * @blog http://www.lxiaocode.com/
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }
}

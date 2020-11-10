package com.lxiaocode.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lixiaofeng
 * @date 2020/11/10 下午3:59
 * @blog http://www.lxiaocode.com/
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}

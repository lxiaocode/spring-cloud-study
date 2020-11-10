package com.lxiaocode.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lixiaofeng
 * @date 2020/11/10 上午9:05
 * @blog http://www.lxiaocode.com/
 */
@EnableConfigServer         // 开启 Spring Cloud Config 服务端功能
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}

package com.lxiaocode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server 服务注册中心
 * @author lixiaofeng
 * @date 2020/11/5 下午3:41
 * @blog http://www.lxiaocode.com/
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}

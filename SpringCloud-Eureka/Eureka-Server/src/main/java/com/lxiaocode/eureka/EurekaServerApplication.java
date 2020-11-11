package com.lxiaocode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lixiaofeng
 * @date 2020/11/5 下午3:41
 * @blog http://www.lxiaocode.com/
 *
 * Eureka Server 服务注册中心
 *
 * 1. 单节点部署时启动 application.yml 配置文件
 * 2. 高可用(双节点)部署时启动 application-peer1.yml、application-peer2.yml 配置文件
 *    这两个节点的服务注册中心会相互注册，当服务实例注册进来时会通过广播的方式进行同步。
 *    保证当某个服务注册中心不可用时，另一个能继续工作。
 */
@EnableEurekaServer // 开启 Eureka 服务注册中心功能
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}

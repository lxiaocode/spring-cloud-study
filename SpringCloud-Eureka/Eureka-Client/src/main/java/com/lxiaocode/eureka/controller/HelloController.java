package com.lxiaocode.eureka.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaofeng
 * @date 2020/11/5 下午4:50
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class HelloController {

    // 服务发现客户端
    private final DiscoveryClient client;

    public HelloController(DiscoveryClient client) {
        this.client = client;
    }

    @GetMapping("/hello")
    public String index() {
        // 获取服务清单并打印返回
        String services = "Services: " + client.getServices();
        System.out.println(services);
        return services + "：Hello World";
    }
}

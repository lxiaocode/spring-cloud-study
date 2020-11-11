package com.lxiaocode.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaofeng
 * @date 2020/11/5 下午7:37
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class ConsumerController {

    private final RestTemplate restTemplate;

    public ConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/consumer/hello")
    public String index() {
        // 通过 @LoadBalanced 注解实现使用服务名调用服务，而不是根据具体的主机地址。
        return restTemplate.getForEntity("http://eureka-client/hello", String.class).getBody();
    }
}

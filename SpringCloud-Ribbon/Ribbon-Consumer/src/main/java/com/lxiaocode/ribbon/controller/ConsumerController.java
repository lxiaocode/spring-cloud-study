package com.lxiaocode.ribbon.controller;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaofeng
 * @date 2020/11/7 下午7:40
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/hello")
    public String index() {
        System.out.println("=== 执行 index");
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }
}

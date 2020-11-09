package com.lxiaocode.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaofeng
 * @date 2020/11/9 下午3:42
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class ConsumerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/hello")
    public String hello() {
        logger.info("=== 执行 hello() 方法...");
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }
}

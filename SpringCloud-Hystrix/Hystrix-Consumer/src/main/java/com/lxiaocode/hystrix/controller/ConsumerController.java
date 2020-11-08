package com.lxiaocode.hystrix.controller;

import com.lxiaocode.hystrix.service.ConsumerService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaofeng
 * @date 2020/11/8 下午8:29
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer/hello")
    public String hello() {
        return consumerService.hello();
    }

    @GetMapping("/consumer/hello/error")
    public String helloError() {
        return consumerService.helloError();
    }

    @GetMapping("/consumer/hello/timeout")
    public String helloTimeout() {
        return consumerService.helloTimeout();
    }
}

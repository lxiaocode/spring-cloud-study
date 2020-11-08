package com.lxiaocode.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import java.util.Random;

/**
 * @author lixiaofeng
 * @date 2020/11/8 下午8:14
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public String hello() {
        logger.info("=== 执行 hello() 方法");
        return "hello World";
    }

    @GetMapping("/hello/error")
    public String helloError() {
        logger.info("=== 执行 helloError() 方法");
        throw new RuntimeException("报错了！！！");
    }

    @GetMapping("/hello/timeout")
    public String helloTimeout() throws InterruptedException {
        int sleepTime = new Random().nextInt(3000);
        logger.info("==== 执行 helloTimeout() 方法");
        logger.info("sleepTime: " + sleepTime);
        Thread.sleep(sleepTime);
        return "hello World";
    }
}

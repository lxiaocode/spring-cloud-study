package com.lxiaocode.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaofeng
 * @date 2020/11/7 下午7:28
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public String index() throws InterruptedException {
        logger.info("========= 调用 index =========");
        return "Hello World";
    }
}

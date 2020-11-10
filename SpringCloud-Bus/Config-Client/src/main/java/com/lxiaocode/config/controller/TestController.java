package com.lxiaocode.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaofeng
 * @date 2020/11/10 下午4:01
 * @blog http://www.lxiaocode.com/
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from() {
        return this.from;
    }
}

package com.lxiaocode.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaofeng
 * @date 2020/10/31 下午2:39
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }
}

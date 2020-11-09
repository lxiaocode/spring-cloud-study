package com.lxiaocode.eureka.controller;

import com.lxiaocode.eureka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author lixiaofeng
 * @date 2020/11/8 下午11:41
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "hello " + user.getName() + ", " + user.getAge();
    }
}

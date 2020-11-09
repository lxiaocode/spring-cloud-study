package com.lxiaocode.feign.service;

import com.lxiaocode.hello.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午10:18
 * @blog http://www.lxiaocode.com/
 */
@Component
@RequestMapping("/fallback")
public class HelloServiceFallback implements RefactorHelloService {

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知", 0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}

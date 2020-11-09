package com.lxiaocode.eureka.controller;

import com.lxiaocode.hello.model.User;
import com.lxiaocode.hello.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午9:44
 * @blog http://www.lxiaocode.com/
 *
 * 实现 Hello-Service-api 提供的接口定义。
 * 通过继承的方式，Controller 中不再包含请求映射注解 @RequestMapping，
 * 而参数注解定义在重写的时候会自动带过来。
 */
@RestController
public class RefactorHelloController implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(User user) {
        return "hello " + user.getName() + ", " + user.getAge();
    }
}

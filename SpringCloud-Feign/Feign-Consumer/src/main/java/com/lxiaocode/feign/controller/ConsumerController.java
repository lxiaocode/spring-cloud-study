package com.lxiaocode.feign.controller;

import com.lxiaocode.feign.model.User;
import com.lxiaocode.feign.service.HelloService;
import com.lxiaocode.feign.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午12:11
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class ConsumerController {

    // 注入 Feign 客户端
    @Autowired
    private HelloService helloService;

    @GetMapping("/consumer/hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("/consumer1")
    public String helloConsumer1() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello("lxiaocode")).append("\n");
        sb.append(helloService.hello("lxiaocode", 20)).append("\n");
        sb.append(helloService.hello(new User("lxiaocode", 20))).append("\n");
        return sb.toString();
    }



    @Autowired
    private RefactorHelloService refactorHelloService;

    @GetMapping("/consumer2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("lxiaocode")).append("\n");
        sb.append(refactorHelloService.hello("lxiaocode", 20)).append("\n");
        sb.append(refactorHelloService.hello(new com.lxiaocode.hello.model.User("lxiaocode", 20))).append("\n");
        return sb.toString();
    }
}

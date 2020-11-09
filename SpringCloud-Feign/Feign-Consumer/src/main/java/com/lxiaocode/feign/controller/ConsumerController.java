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

//    @Autowired
//    private HelloService helloService;
    @Autowired
    private RefactorHelloService refactorHelloService;

//    @GetMapping("/consumer/hello")
//    public String hello() {
//        return helloService.hello();
//    }
//
//    @GetMapping("/consumer/hello1")
//    public String hello(@RequestParam String name) {
//        return helloService.hello(name);
//    }
//
//    @GetMapping("/consumer/hello2")
//    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
//        return helloService.hello(name, age);
//    }
//
//    @PostMapping("/consumer/hello3")
//    public String hello(@RequestBody User user) {
//        return helloService.hello(user);
//    }

    @GetMapping("/consumer2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("lxiaocode")).append("\n");
        sb.append(refactorHelloService.hello("lxiaocode", 20)).append("\n");
        sb.append(refactorHelloService.hello(new com.lxiaocode.hello.model.User("lxiaocode", 20))).append("\n");
        return sb.toString();
    }
}

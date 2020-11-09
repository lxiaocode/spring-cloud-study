package com.lxiaocode.feign.service;

import com.lxiaocode.feign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午12:10
 * @blog http://www.lxiaocode.com/
 */
//@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
public interface HelloService {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/hello1")
    String hello(@RequestParam String name);

    @GetMapping("/hello2")
    User hello(@RequestHeader String name, @RequestHeader Integer age);

    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}

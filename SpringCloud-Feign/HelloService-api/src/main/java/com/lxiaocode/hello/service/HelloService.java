package com.lxiaocode.hello.service;

import com.lxiaocode.hello.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午9:39
 * @blog http://www.lxiaocode.com/
 *
 * Eureka-Provider 服务的接口定义
 */
@RequestMapping("/refactor")
public interface HelloService {

    @GetMapping("/hello4")
    String hello(@RequestParam String name);

    @GetMapping("/hello5")
    User hello(@RequestHeader String name, @RequestHeader Integer age);

    @PostMapping("/hello6")
    String hello(@RequestBody User user);
}

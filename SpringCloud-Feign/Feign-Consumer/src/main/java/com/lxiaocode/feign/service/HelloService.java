package com.lxiaocode.feign.service;

import com.lxiaocode.feign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午12:10
 * @blog http://www.lxiaocode.com/
 *
 * 通过 @FeignClient 注解指定服务名来绑定服务，服务名不区分大小写。
 * ---------------------------------------------------------------------------------------
 * 注意：
 *      如果我们要创建多个具有相同名字或 URL 的 Feign 客户端，使它们指向同一台服务器，
 *      但每个客户端的配置具有不同的自定义配置，则必须使用 contextId 属性，避免 bean 冲突。
 */
@FeignClient(value = "hello-service", contextId = "hello")
public interface HelloService {

    @GetMapping("/hello")
    String hello();

    /**
     * 以下为参数绑定示例
     * @param name
     * @return
     */
    @GetMapping("/hello1")
    String hello(@RequestParam String name);

    @GetMapping("/hello2")
    User hello(@RequestHeader String name, @RequestHeader Integer age);

    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}

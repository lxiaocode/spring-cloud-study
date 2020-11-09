package com.lxiaocode.feign.service;

import com.lxiaocode.hello.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午9:47
 * @blog http://www.lxiaocode.com/
 */

@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
public interface RefactorHelloService extends HelloService {
    /**
     * Feign 继承特性的优缺点
     * 优点：
     *      将接口的定义从 controller 中剥离出来，通过 maven 可以轻易的实现接口的定义的共享。
     *      实现在构建期的接口绑定，从而减少客户端的绑定配置。
     * 缺点：
     *      由于和接口建立起了依赖，那么接口的变动就会对项目构建造成影响。
     */
}

package com.lxiaocode.feign.service;

import com.lxiaocode.hello.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午9:47
 * @blog http://www.lxiaocode.com/
 *
 * Feign 继承特性
 * 优点：
 *      将接口的定义从 controller 中剥离出来，通过 maven 可以轻易的实现接口的定义的共享。
 *      实现在构建期的接口绑定，从而减少客户端的绑定配置。
 * 缺点：
 *      由于和接口建立起了依赖，那么接口的变动就会对项目构建造成影响。
 *
 * HelloService 将 hello-service 服务的接口定义抽象出来，
 * 提供给 Eureka-Provider(服务提供者) 和 Feign-Consumer(服务消费者)，实现接口定义共享。
 *
 * 具体可以查看 Hello-Service-api 模块、Eureka-Provider 服务
 * ---------------------------------------------------------------------------------------
 * 注意：
 *      如果我们要创建多个具有相同名字或 URL 的 Feign 客户端，使它们指向同一台服务器，
 *      但每个客户端的配置具有不同的自定义配置，则必须使用 contextId 属性，避免 bean 冲突。
 */
@FeignClient(value = "hello-service", contextId = "hello-refactor", fallback = HelloServiceFallback.class)
public interface RefactorHelloService extends HelloService {
}

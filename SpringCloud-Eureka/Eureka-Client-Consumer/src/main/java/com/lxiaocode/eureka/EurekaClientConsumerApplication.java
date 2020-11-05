package com.lxiaocode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Eureka Client 在这里充当服务消费者
 * （通常 Eureka Client 既是服务提供者也是服务消费者，为了演示说明方便在这里仅充当服务消费者）
 * @author lixiaofeng
 * @date 2020/11/5 下午7:34
 * @blog http://www.lxiaocode.com/
 */
// 开启服务发现支持。这是通用的服务发现注解，适用与不同的服务发现框架。
// 相同作用的注解还有 @EnableEurekaClient 这是用于开启 Eureka 的服务发现支持。
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerApplication.class, args);
    }

    /**
     * RestTemplate 只是类似于 httpclient 的一种发送rest风格的请求，它是无法识别微服务名称。
     * 只有 @loadBalance 注解修饰的 RestTemplate 才能实现服务名的调用，没有修饰的 RestTemplate 是没有该功能的。
     * 原因就是当使用微服务名称的时候，可能有多个服务提供者，RestTemplate 不知道去调用哪个服务提供者，
     * 只有设置负载均衡之后服务消费者才会去访问某个微服务提供者。
     * @return
     */
    @Bean
    @LoadBalanced   // 开启负载均衡支持
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

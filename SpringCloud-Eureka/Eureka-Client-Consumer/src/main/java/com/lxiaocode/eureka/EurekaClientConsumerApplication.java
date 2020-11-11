package com.lxiaocode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaofeng
 * @date 2020/11/5 下午7:34
 * @blog http://www.lxiaocode.com/
 *
 * Eureka Client 在这里充当服务消费者
 * 通过服务发现功能，获取服务注册中心上的服务清单，以便调用服务。
 */
@EnableDiscoveryClient // 开启服务发现功能，或者使用 Eureka 专用的 @EnableEurekaClient 注解。
@SpringBootApplication
public class EurekaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerApplication.class, args);
    }

    /**
     * 创建 RestTemplate 对象，用于通过 http 请求的方式调用服务
     * 注意：
     *      只有 @loadBalance 注解修饰的 RestTemplate 才能实现服务名的调用，没有修饰的 RestTemplate 是没有该功能的。
     *      原因就是当使用微服务名称的时候，可能有多个服务提供者，RestTemplate 不知道去调用哪个服务提供者，
     *      只有设置负载均衡之后服务消费者才会去访问某个微服务提供者。
     * @return
     */
    @Bean
    @LoadBalanced // 开启负载均衡支持
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

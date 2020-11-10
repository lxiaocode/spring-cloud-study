package com.lxiaocode.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaofeng
 * @date 2020/11/7 下午7:36
 * @blog http://www.lxiaocode.com/
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerApplication.class, args);
    }

    /**
     * RestTemplate 解析
     * 1. GET 请求
     *    getForEntity() 函数，该方法返回的是 ResponseEntity 对象，该对象是 Spring 对 HTTP 请求响应的封装。
     *    getForObject() 函数，该方法对 HTTP 的请求响应体 body 内容进行对象转换，实现请求直接返回包装好的对象内容。
     * 2. POST 请求
     *    postForEntity() 函数，与 GET 请求类似。
     *    postForObject() 函数，与 GET 请求类似。
     *    postForLocation() 函数，以 post 请求提交资源，并返回新资源的 URI
     * 3. PUT 请求
     *    put() 函数。
     * 4. DELETE 请求
     *    deleted() 函数
     * @return
     */
    @Bean
    @LoadBalanced   // 开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

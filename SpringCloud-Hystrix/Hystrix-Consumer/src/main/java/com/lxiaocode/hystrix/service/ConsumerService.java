package com.lxiaocode.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixiaofeng
 * @date 2020/11/8 下午9:04
 * @blog http://www.lxiaocode.com/
 */
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    private final String uri = "http://hello-service";

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello() {
        return restTemplate.getForEntity(uri + "/hello", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "helloErrorFallback")
    public String helloError() {
        return restTemplate.getForEntity(uri + "/hello/error", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "helloTimeoutFallback")
    public String helloTimeout() {
        return restTemplate.getForEntity(uri + "/hello/timeout", String.class).getBody();
    }

    /**
     * 在实际使用时，我们需要为大多数执行过程可能失败的 Hystrix 命令实现服务降级逻辑，但是有些情况可以不实现服务降级。
     * 1. 执行写操作的命令
     *    写操作的返回值通常是 void，实现服务降级意义不大。
     *    当写入失败的时候，我们通常只需要通知调用者即可
     * 2. 执行批处理或离线计算的命令
     *
     */

    /**
     * Hystrix 的使用还有
     * 1. 命令名称、分组以及线程池划分
     * 2. 请求缓存
     * 3. 请求合并
     */

    private String helloFallback() {
        return "hello() error";
    }

    // 通过添加 Throwable e 参数实现异常获取
    private String helloErrorFallback(Throwable e) {
        System.out.println(e.getMessage());
        return "helloError() error";
    }

    private String helloTimeoutFallback() {
        return "helloTimeout() error";
    }
}

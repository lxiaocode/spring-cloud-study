package com.lxiaocode.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixiaofeng
 * @date 2020/11/10 下午3:29
 * @blog http://www.lxiaocode.com/
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }
}

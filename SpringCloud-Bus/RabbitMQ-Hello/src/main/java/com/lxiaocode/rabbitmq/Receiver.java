package com.lxiaocode.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author lixiaofeng
 * @date 2020/11/10 下午3:28
 * @blog http://www.lxiaocode.com/
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String context) {
        System.out.println("Receiver: " + context);
    }
}

package com.lxiaocode.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lixiaofeng
 * @date 2020/11/10 下午3:31
 * @blog http://www.lxiaocode.com/
 */
@SpringBootTest
public class RabbitMQApplicationTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}

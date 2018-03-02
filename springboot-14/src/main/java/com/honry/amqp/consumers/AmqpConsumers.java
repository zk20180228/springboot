package com.honry.amqp.consumers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description:消费者
 * @Author: zhangkui
 * @CreateDate: 2018/1/29 10:38
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Component
@RabbitListener(queues = {"honry.logMq"})
public class AmqpConsumers {

    @RabbitHandler
    public void revMsg(String msg){
        System.out.println("消费者收到异常消息如下：");
        System.out.println(msg);
    }


}

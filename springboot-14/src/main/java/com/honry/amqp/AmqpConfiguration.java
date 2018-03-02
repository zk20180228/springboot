package com.honry.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:消费者也要定义队列
 * @Author: zhangkui
 * @CreateDate: 2018/1/29 10:34
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Configuration
public class AmqpConfiguration {

    @Bean
    public Queue queue(){

            return new Queue("honry.logMq");
    }

}

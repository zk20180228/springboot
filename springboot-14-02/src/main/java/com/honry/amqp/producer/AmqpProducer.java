package com.honry.amqp.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description:生产者
 * @Author: zhangkui
 * @CreateDate: 2018/1/29 10:38
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Component
public class AmqpProducer {

    @Resource
    private AmqpTemplate amqpTemplate;


    public void sendMsg(){
        try {
            int i=1/0;
        } catch (Exception e) {
            System.out.println("生产者：发生异常，正在发送异常信息！");
            this.amqpTemplate.convertAndSend("honry.logMq","error"+e.getMessage());
        }
    }


}

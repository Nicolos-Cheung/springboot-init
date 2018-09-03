package com.zn.springbootdemo.jms.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by ning on 3/9/18.
 * <p>
 * RabbitMQ发送端 （测试）
 */
@Component
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Scheduled(fixedRate = 16000) //每隔6秒执行一次
    public void send() {

        amqpTemplate.convertAndSend("test_queue", "当前时间" + new Date());
    }

    @Scheduled(fixedRate = 6000) //每隔6秒执行一次
    public void sendtoexchange() {
        amqpTemplate.convertAndSend("orderbus", "computer", "当前时间" + new Date());
        amqpTemplate.convertAndSend("orderbus", "phone", "当前时间" + new Date());
    }
}

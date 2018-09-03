package com.zn.springbootdemo.jms.rabbitmq;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by ning on 3/9/18.
 * <p>
 * RabbitMQ 消息接收者
 */
@Component
public class RabbitMQReveiver {


    //    @RabbitListener(queues = "test_queue")
    @RabbitListener(queuesToDeclare = @Queue("test_queue"))  //没有该队列会自动创建
    public void process(String message) {
        System.out.println(message);
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("orderbus"),
            key = "computer",
            value = @Queue("computer_queue")))
    public void process1(String message)  {
        System.out.println(message);
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("orderbus"),
            key = "phone",
            value = @Queue("phone_queue")))
    public void process2(String message) {
        System.out.println(message);
    }
}

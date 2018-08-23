package com.zn.springbootdemo.jms.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


/**
 * 发布订阅：一个队列可以由多个消费线程消费。
 */
@Component
public class TopicSub {

    @JmsListener(destination = "news.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive1(String text) {
        System.out.println("news.topic 消费者:receive1=" + text);
    }

    @JmsListener(destination = "news.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive2(String text) {
        System.out.println("news.topic 消费者:receive2=" + text);
    }

    @JmsListener(destination = "news.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive3(String text) {
        System.out.println("news.topic 消费者:receive3=" + text);
    }


}

package com.zn.springbootdemo.jms.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


/**
 * order.queue 监听消费
 */
@Component
public class OrderConsumer {

	@JmsListener(destination="order.queue")
	public void receiveQueue(String text){
		System.out.println("OrderConsumer收到的报文为:"+text);
	}
}

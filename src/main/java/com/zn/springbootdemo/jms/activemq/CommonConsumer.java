package com.zn.springbootdemo.jms.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CommonConsumer {

	/**
	 * 点对点消费，即一个队列只能有一个消费者进行消费。
	 */
	@JmsListener(destination="common.queue")
	public void receiveQueue(String text){
		System.out.println("CommonConsumer收到的报文为:"+text);
	}
	
}

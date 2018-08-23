package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.domain.JsonData;
import com.zn.springbootdemo.jms.activemq.service.ProducerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * 功能描述：模拟微信支付回调
 */
@RestController
@RequestMapping("/activemq")
@Api(value = "ActiveMQ 消息队列接口", description = "ActiveMQ 消息队列接口")
public class ActiveMQController {

    @Autowired
    private ProducerService producerService;

    /**
     * 功能描述：微信支付回调接口
     *
     * @param msg 支付信息
     * @return
     */
    @GetMapping("order")
    @ApiOperation("支付信息加入order.queue队列")
    public Object order(String msg) {

        Destination destination = new ActiveMQQueue("order.queue");

        producerService.sendMessage(destination, msg);

        return JsonData.buildSuccess();
    }

    @GetMapping("common")
    @ApiOperation("信息加入common.queue队列")
    public Object common(String msg) {
        producerService.sendMessage(msg);
        return JsonData.buildSuccess();
    }


    @GetMapping("topic")
    @ApiOperation("activeMQ发布订阅模式，多消费者消费数据")
    public Object publish(String msg) {
        producerService.publish(msg);
        return JsonData.buildSuccess();
    }


//	/**
//	 * 功能描述：微信支付回调接口
//	 * @param msg 支付信息
//	 * @return
//	 */
//	@GetMapping("comment")
//	public Object comment(String msg) throws MQClientException, RemotingException, MQBrokerException, InterruptedException, UnsupportedEncodingException{
//	  
//		/**
//        * 创建一个消息实例，包含 topic、tag 和 消息体           
//       */
//       Message message = new Message("commentTopic","add", msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
//       
//       //同步的方式，会有返回结果,发送的是普通消息
//       SendResult result = msgProducer.getProducer().send(message);
//       
//       System.out.println("发送响应：MsgId:" + result.getMsgId() + "，发送状态:" + result.getSendStatus());
//     
//       return JsonData.buildSuccess();
//	}


}

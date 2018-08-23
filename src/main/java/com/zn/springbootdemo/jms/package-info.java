/**
 * Created by ning on 22/8/18.
 * <p>
 * 消息队列相关类
 * <p>
 * <p>
 * 1、JMS介绍和使用场景及基础编程模型
 * 简介：讲解什么是小写队列，JMS的基础知识和使用场景
 * 1、什么是JMS: Java消息服务（Java Message Service),Java平台中关于面向消息中间件的接口
 * <p>
 * 2、JMS是一种与厂商无关的 API，用来访问消息收发系统消息，它类似于JDBC(Java Database Connectivity)。这里，JDBC 是可以用来访问许多不同关系数据库的 API
 * <p>
 * 3、使用场景：
 * 1）跨平台
 * 2）多语言
 * 3）多项目
 * 4）解耦
 * 5）分布式事务
 * <p>
 * 6）流量控制
 * 7）最终一致性
 * 8）RPC调用
 * 上下游对接，数据源变动->通知下属
 * 4、概念
 * JMS提供者：Apache ActiveMQ、RabbitMQ、Kafka、Notify、MetaQ、RocketMQ
 * JMS生产者(Message Producer)
 * JMS消费者(Message Consumer)
 * JMS消息
 * JMS队列
 * JMS主题
 * <p>
 * JMS消息通常有两种类型：点对点（Point-to-Point)、发布/订阅（Publish/Subscribe）
 * <p>
 * 5、编程模型
 * MQ中需要用的一些类
 * ConnectionFactory ：连接工厂，JMS 用它创建连接
 * Connection ：JMS 客户端到JMS Provider 的连接
 * Session： 一个发送或接收消息的线程
 * Destination ：消息的目的地;消息发送给谁.
 * MessageConsumer / MessageProducer： 消息接收者，消费者
 */
package com.zn.springbootdemo.jms;
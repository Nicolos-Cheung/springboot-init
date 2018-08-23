/**
 * Created by ning on 22/8/18.
 * <p>
 * ActiveMQ5.x消息队列基础介绍和安装
 * <p>
 * 简介：介绍ActiveMQ5.x消息队列基础特性和本地快速安装
 * 特点：
 * 1）支持来自Java，C，C ++，C＃，Ruby，Perl，Python，PHP的各种跨语言客户端和协议
 * 2）支持许多高级功能，如消息组，虚拟目标，通配符和复合目标
 * 3) 完全支持JMS 1.1和J2EE 1.4，支持瞬态，持久，事务和XA消息
 * 4) Spring支持，ActiveMQ可以轻松嵌入到Spring应用程序中，并使用Spring的XML配置机制进行配置
 * 5) 支持在流行的J2EE服务器（如TomEE，Geronimo，JBoss，GlassFish和WebLogic）中进行测试
 * 6) 使用JDBC和高性能日志支持非常快速的持久化
 * ...
 * <p>
 * 1、下载地址：http://activemq.apache.org/activemq-5153-release.html
 * 2、快速开始：http://activemq.apache.org/getting-started.html
 * 3、如果我们是32位的机器，就双击win32目录下的activemq.bat,如果是64位机器，则双击win64目录下的activemq.bat
 * 4、bin目录里面启动 选择对应的系统版本和位数
 *          activeMQ start 启动
 *          activeMQ console 手动控制台方式启动
 * 5、启动后访问路径http://127.0.0.1:8161/
 * <p>
 * 6、用户名和密码默认都是admin
 * 7、官方案例集合
 * https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples
 * 面板：
 * Name：队列名称。
 * Number Of Pending Messages：等待消费的消息个数。
 * Number Of Consumers：当前连接的消费者数目
 * Messages Enqueued：进入队列的消息总个数，包括出队列的和待消费的，这个数量只增不减。
 * Messages Dequeued：已经消费的消息数量。
 */
package com.zn.springbootdemo.jms.activemq;
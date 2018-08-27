package com.zn.springbootdemo;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

//@EnableTransactionManagement  //开启声明式事务支持--默认已开启
@SpringBootApplication() //scanBasePackages = ""
@ServletComponentScan(basePackages = "com.zn.springbootdemo.web") //传统serlvet方式，扫描servlet、filter
@MapperScan("com.zn.springbootdemo.mapper")
@EnableScheduling  //开启定时任务
@EnableAsync //开启异步任务
@EnableJms //开启支持jms
@EnableSwagger2 //开启swagger2
@EnableJpaRepositories(basePackages = "com.zn.springbootdemo.data") //扫描该包数据访问接口定义（jpa rest）
@Import(RepositoryRestMvcAutoConfiguration.class) //导入默认的Spring-data-Rest配置
@EnableCaching //开启声明式缓存支持
public class SpringbootdemoApplication {

    @Bean //非 常规写法，交给spring管理，只是为了后期测试方便直接注入该Queue对象
    public Queue queue() {
        return new ActiveMQQueue("common.queue");
    }


    @Bean
    public Topic topic() {
        return new ActiveMQTopic("news.topic");
    }


    //需要给topic定义独立的JmsListenerContainer，否则普通queue中的消息无法被消费
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}

 ## SpringBoot2.x 基础开发骨架整合-SpringBoot微服务开发框架
![avatar](https://spring.io/img/homepage/diagram-boot-reactor.svg)
***
#Springboot整合列表总览:
 * Swagger2
 * LogBack
 * cron定时任务
 * Mybatis
 * Redis
 * ActiveMQ
 * RabbitMQ
 * Spring-Data-JPA
 * Spring-Data-Rest
 * WebFlux
 * Cache(Ehcache、Redis、Generic)
 * 热部署

 
 >相关文档说明详见：localhost:8080/swagger-ui.html 
 



项目启动流程：
1、配置数据库，根据配置创建数据库，表无需创建
2、若开启JMS支持，需要配置相关队列的配置文件，并开启相关服务
3、开启Mongodb Redis相关服务
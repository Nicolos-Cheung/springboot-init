/**
 * Created by ning on 22/8/18.

  日志框架LogBack

 1、新日志框架LogBack介绍
 简介：日志介绍和新日志框架Logback讲解

 1.常用处理java的日志组件 slf4j,log4j,logback,common-logging 等

 2、logback介绍：基于Log4j基础上大量改良，不能单独使用，推荐配合日志框架SLF4J来使用
 logback当前分成三个模块：logback-core,logback-classic和logback-access;
 logback-core是其它两个模块的基础模块

 3、Logback的核心对象：
 Logger：日志记录器
 Appender：指定日志输出的目的地，目的地可以是控制台，文件
 Layout：日志布局 格式化日志信息的输出

 4、日志级别：DEBUG < INFO < WARN < ERROR  =>线上一般使用WARN或INFO级别，不使用DEBUG

 ===========log4j示例===========
 ### 设置###
 log4j.rootLogger = debug,stdout,D,E

 ### 输出信息到控制抬 ###
 log4j.appender.stdout = org.apache.log4j.ConsoleAppender
 log4j.appender.stdout.Target = System.out
 log4j.appender.stdout.layout = org.apache.log4j.PatternLayout
 log4j.appender.stdout.layout.ConversionPattern = [%-5p] %d{yyyy-MM-dd HH:mm:ss,SSS} method:%l%n%m%n

 ### 输出DEBUG 级别以上的日志到=D://logs/error.log ###
 log4j.appender.D = org.apache.log4j.DailyRollingFileAppender
 log4j.appender.D.File = D://logs/log.log
 log4j.appender.D.Append = true
 log4j.appender.D.Threshold = DEBUG
 log4j.appender.D.layout = org.apache.log4j.PatternLayout
 log4j.appender.D.layout.ConversionPattern = %-d{yyyy-MM-dd HH:mm:ss}  [ %t:%r ] - [ %p ]  %m%n

 ### 输出ERROR 级别以上的日志到=D://logs/error.log ###
 log4j.appender.E = org.apache.log4j.DailyRollingFileAppender
 log4j.appender.E.File =E://logs/error.log
 log4j.appender.E.Append = true
 log4j.appender.E.Threshold = ERROR
 log4j.appender.E.layout = org.apache.log4j.PatternLayout
 log4j.appender.E.layout.ConversionPattern = %-d{yyyy-MM-dd HH:mm:ss}  [ %t:%r ] - [ %p ]  %m%n

 ===========logback============

 4、Log4j日志转换为logback在线工具（支持log4j.properties转换为logback.xml,不支持 log4j.xml转换为logback.xml）
 https://logback.qos.ch/translator/


 2、SpringBoot2.x日志讲解和自定义Logback配置实战
 简介：讲解SpringBoot2.x整合Logback配置实战

 1、官网介绍：https://docs.spring.io/spring-boot/docs/2.1.0.BUILD-SNAPSHOT/reference/htmlsingle/#boot-features-logging

 各个组件案例：https://logback.qos.ch/manual/index.html

 2、分析SpringBoot启动日志
 1）默认情况下，Spring Boot将日志输出到控制台

 3、整合Logback实战
 1）创建 日志文件logback-spring.xml，官方推荐 -spring.xml结尾
 默认加载加载配置顺序 logback-spring.xml, logback-spring.groovy, logback.xml, or logback.groovy

 注释：
 <configuration> 子节点
 <appender></appender>
 <logger></logger>
 <root></root>(要加在最后)

 */
package com.zn.springbootdemo.logback;
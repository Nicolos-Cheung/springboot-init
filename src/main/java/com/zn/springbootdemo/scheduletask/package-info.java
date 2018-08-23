/**
 * Created by ning on 22/8/18.
 *
 * 定时任务
 * 简介：SpringBoot常用定时任务表达式配置和在线生成器

 1、cron 定时任务表达式 @Scheduled(cron="* /1 * * * * *") 表示每秒
        1）crontab 工具  https://tool.lu/crontab/
        2、fixedRate: 定时多久执行一次（上一次开始执行时间点后xx秒再次执行）
        3、fixedDelay: 上一次执行结束时间点后xx秒再次执行
        4、fixedDelayString:  字符串形式，可以通过配置文件指定
 */
package com.zn.springbootdemo.scheduletask;
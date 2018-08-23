package com.zn.springbootdemo.scheduletask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by ning on 22/8/18.
 * <p>
 * SpringBoot注解方式开启定时任务
 * <p>
 * 1）启动类里面 @EnableScheduling开启定时任务，自动扫描
 * 2）定时任务业务类 加注解 @Component被容器扫描
 */
@Component
public class TaskDemo {


//		1、cron 定时任务表达式 @Scheduled(cron="*/2 * * * * *") 表示每2秒
//            1）crontab 工具  https://tool.lu/crontab/
//            2、fixedRate: 定时多久执行一次（上一次开始执行时间点后xx秒再次执行；）
//            3、fixedDelay: 上一次执行结束时间点后xx秒再次执行
//		4、fixedDelayString:  字符串形式，可以通过配置文件指定

    @Scheduled(fixedRate = 6000) //每隔6秒执行一次
    public void sum() {

        System.out.println("当前时间" + new Date());

    }


    @Scheduled(cron = "*/60 * * * * *")
    public void sum2() {
        System.out.println("cron 分钟频率执行 当前时间:" + new Date());
    }

}

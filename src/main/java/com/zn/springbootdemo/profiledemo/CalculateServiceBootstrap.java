package com.zn.springbootdemo.profiledemo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringFrameWork条件装配演示--引导类
 * <p>
 * 基于配置方式-@profile实现条件装配
 * <p>
 * Created by ning on 15/8/18.
 */
@SpringBootApplication(scanBasePackages = "com.zn.springbootdemo.profiledemo")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java7")
                .run(args);

        System.out.println(context.getBean(CalculateService.class).sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        context.close();
    }

}

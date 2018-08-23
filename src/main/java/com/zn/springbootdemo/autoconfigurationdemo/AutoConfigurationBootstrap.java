package com.zn.springbootdemo.autoconfigurationdemo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringBoot自动装配--引导类
 * <p>
 * 1. 激活自动装配 - @EnableAutoConfiguration
 * 2. 实现自动装配 - XXXAutoConfiguration
 * 3. 配置自动装配实现 - META-INF/spring.factories
 * <p>
 * Created by ning on 15/8/18.
 */
@EnableAutoConfiguration
public class AutoConfigurationBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(AutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        context.close();
    }

}

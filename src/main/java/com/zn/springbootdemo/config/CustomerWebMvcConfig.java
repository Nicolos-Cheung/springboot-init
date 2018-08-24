package com.zn.springbootdemo.config;

import com.zn.springbootdemo.interceptor.LoginIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by ning on 23/8/18.
 *
 * 拦截器配置
 *
 * SpringBoot2.x之前需要继承WebMvcConfigurationAdapter
 */
@Configuration
public class CustomerWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/login");

        WebMvcConfigurer.super.addInterceptors(registry);

    }
}

package com.zn.springbootdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ning on 13/8/18.
 * <p>
 * 全局通用配置
 */
@Component
@ConfigurationProperties(prefix = "general")
@Data
public class Config {

    public static String redis_expiration; //redis过期时间

}

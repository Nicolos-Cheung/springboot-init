package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ning on 10/8/18.
 */
@RestController()
public class TestController {

    @Autowired
    private Config config;

    @RequestMapping(path = "/")
    public String home() {
        return config.redis_expiration;
    }


}

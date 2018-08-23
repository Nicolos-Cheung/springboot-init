package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.domain.JsonData;
import com.zn.springbootdemo.domain.User;
import com.zn.springbootdemo.utils.JsonUtils;
import com.zn.springbootdemo.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/redis")
public class RedisTestController {


//    @Autowired
//    private StringRedisTemplate redisTpl; //jdbcTemplate

    @Autowired
    private RedisClient redis;

    @GetMapping(value = "add")
    public Object add() {

        //redisTpl.opsForValue().set("name", "zn");
        redis.set("name", "zn");
        return JsonData.buildSuccess();

    }

    @GetMapping(value = "get")
    public Object get() {

        //String value = redisTpl.opsForValue().get("name");
        String value = redis.get("name");
        return JsonData.buildSuccess(value);

    }


    @GetMapping(value = "save_user")
    public Object saveUser() {
        User user = new User(1, "abc", "11", new Date());
        String userStr = JsonUtils.obj2String(user);
        boolean flag = redis.set("base:user:11", userStr);
        return JsonData.buildSuccess(flag);

    }

    @GetMapping(value = "find_user")
    public Object findUser() {

        String userStr = redis.get("base:user:11");
        User user = JsonUtils.string2Obj(userStr, User.class);

        return JsonData.buildSuccess(user);

    }


}

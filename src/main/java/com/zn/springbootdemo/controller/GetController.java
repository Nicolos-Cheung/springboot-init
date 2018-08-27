package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.domain.Person;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by ning on 10/8/18.
 * <p>
 * RESTFUL协议 --  URL中不应该含有动词
 */
@RestController
@Api(value = "RESTFUL协议测试服务", description = "RESTFUL协议测试服务")
public class GetController {

    @RequestMapping(path = "/user/{user_id}", method = RequestMethod.GET)
    public Object findPerson(@PathVariable("user_id") String user_id) {

        //service.queryPerson(user_id)
        int i = 1 / 0;
        return new Person(user_id, "123", "1234567890", new Date());

    }

    /**
     * 请求URL localhost:8080/u/xxx
     * 不需要指定RequestMethod.GET
     */

    @GetMapping(path = "/u/{user_id}")
    public Object findPerson2(@PathVariable("user_id") String user_id) {

        //service.queryPerson(user_id)
        return new Person(user_id, "123", "1234567890", new Date());

    }

    /**
     * 请求URL localhost:8080/user?user_id=xxx
     */
    @GetMapping(path = "/user")
    public Object findPerson3(@RequestParam(name = "user_id") String user_id) {

        return new Person(user_id, "123", "1234567890", new Date());

    }

    /**
     * json对象传参 (POST)
     * http头：content-type = application/json
     *
     * @param person
     * @return
     */
    @PostMapping("/user")
    public Person savePerson(@RequestBody Person person) {
        return person;
    }


    /**
     * 获取HTTP 头信息
     * 发送HTTP请求时，access_token放入Headers中
     *
     * @param access_token
     */
    @GetMapping("/login")
    public void getHeader(@RequestHeader("access_token") String access_token) {

        System.out.println(access_token);
    }

    /*
     * RESTFUL其余请求方式均可通过  @DeleteMapping   @PutMapping来接收
     */
}

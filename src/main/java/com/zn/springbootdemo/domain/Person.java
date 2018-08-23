package com.zn.springbootdemo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by ning on 10/8/18.
 */

@Data
public class Person {

    private String username;

    @JsonProperty("phone_num")  //前端收到json中的key为phone_num
    private String phone;

    @JsonIgnore //该字段不会封装到json中
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL) //null字段不封装到json
    private String desc;

    public Person(String username, String password, Date createTime) {
        this.username = username;
        this.password = password;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", desc='" + desc + '\'' +
                '}';
    }
}

package com.zn.springbootdemo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private int id;

    private String name;

    private String phone;

    private int age;

    private Date createTime;

    public User() {

    }

    public User(int age, String name, String phone, Date createTime) {
        super();
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.createTime = createTime;
    }

}

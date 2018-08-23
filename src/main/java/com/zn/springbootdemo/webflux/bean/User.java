package com.zn.springbootdemo.webflux.bean;

import lombok.Data;

/**
 * Created by ning on 23/8/18.
 */

@Data
public class User {

    private String id;

    private String name;

    public User(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
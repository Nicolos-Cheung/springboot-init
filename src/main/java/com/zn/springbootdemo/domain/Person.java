package com.zn.springbootdemo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ning on 10/8/18.
 */

public class Person implements Serializable {

    private String username;

    @JsonProperty("phone_num")  //接收前端json phone_num的数据，或返回json 为 phone_num ->尤其注意该点
    private String phone;

    @JsonIgnore //该字段不会封装到json中
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL) //null字段不封装到json
    private String desc;

    public Person() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Person(String username, String password, String phone, Date createTime) {
        this.username = username;
        this.phone = phone;
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

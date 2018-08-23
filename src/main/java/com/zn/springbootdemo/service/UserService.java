package com.zn.springbootdemo.service;


import com.zn.springbootdemo.domain.User;

public interface UserService {

    public int add(User user);


    /**
     * 功能描述：测试事务
     *
     * @return
     */
    public int addAccount();



}

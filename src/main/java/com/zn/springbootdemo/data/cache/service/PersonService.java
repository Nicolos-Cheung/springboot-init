package com.zn.springbootdemo.data.cache.service;

import com.zn.springbootdemo.data.cache.Person;

/**
 * Created by ning on 24/8/18.
 */
public interface PersonService {


    /**
     * 测试声明式事务使用
     */
    public Person savePersonWithRollBack(Person person);

    public Person savePersonWithOutRollBack(Person person);


    /**
     * 测试缓存使用
     *
     * @param person
     * @return
     */
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Long id);

}

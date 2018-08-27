package com.zn.springbootdemo.data.cache.service.impl;

import com.zn.springbootdemo.data.cache.Person;
import com.zn.springbootdemo.data.cache.PersonRepository;
import com.zn.springbootdemo.data.cache.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ning on 24/8/18.
 */

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)//异常发生数据回滚
    public Person savePersonWithRollBack(Person person) {

        return null;
    }

    @Override
    @Transactional(noRollbackFor = Exception.class) //异常发生数据不回滚
    public Person savePersonWithOutRollBack(Person person) {
        return null;
    }

    @Override
    @CachePut(value = "people", key = "#person.id") //缓存名称：people
    public Person save(Person person) {
        System.out.println("首次查询...数据加入缓存..");
        return personRepository.save(person);
    }

    @Override
    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.println("删除id/key 为" + id + "的数据");
        personRepository.deleteById(id);
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Long id) {
        return personRepository.findById(id).get();
    }
}

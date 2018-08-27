package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.data.cache.Person;
import com.zn.springbootdemo.data.cache.service.PersonService;
import com.zn.springbootdemo.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ning on 25/8/18.
 */

@RestController
@RequestMapping("/cache")
public class CacheTestController {

    @Autowired
    PersonService personService;


    /**
     * 请求方式为: get localhost:8080/person/put?name=zn&age=12&address=shandong
     * 如果使用Post 以Json的方式，注意对象转换，并使用RequestBody注解
     *
     * @param person
     * @return
     */
    @RequestMapping("/person/put")
    public Person put(Person person) {

        System.out.println(person.toString());
        return personService.save(person);

    }

    @RequestMapping("/person")
    public Object evit(Long id) {
        personService.remove(id);
        return JsonData.buildSuccess();
    }

    @RequestMapping("/person/{id}")
    public Person findPerson(@PathVariable Long id) {
        return personService.findOne(id);
    }
}

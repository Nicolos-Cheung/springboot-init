package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.data.cache.Person;
import com.zn.springbootdemo.data.cache.service.PersonService;
import com.zn.springbootdemo.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PutMapping("/person")
    public Person put(@RequestBody Person person) {

        System.out.println(person.toString());
        return personService.save(person);

    }

    @DeleteMapping("/person")
    public Object evit(Long id) {
        personService.remove(id);
        return JsonData.buildSuccess();
    }

    @GetMapping("/person/{id}")
    public Person findPerson(@PathVariable Long id) {
        return personService.findOne(id);
    }


}

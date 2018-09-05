package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.data.mongo.MongoPersonRepository;
import com.zn.springbootdemo.data.mongo.bean.Location;
import com.zn.springbootdemo.data.mongo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by ning on 5/9/18.
 */
@RestController
@RequestMapping("/mongo")
public class MongoTestController {

    @Autowired
    MongoPersonRepository mongoPersonRepository;

    @RequestMapping("/save")
    public Person save() {

        Person p = new Person("zn", 18);

        Collection<Location> c = new LinkedHashSet();
        Location l1 = new Location("Hongkong", "1996");
        Location l2 = new Location("GuangDong", "2004");
        Location l3 = new Location("Nanjign", "2012");
        Location l4 = new Location("Shanghai", "2018");

        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(l4);

        p.setLocations(c);

        return mongoPersonRepository.save(p);
    }


    @RequestMapping("q1")
    public Person q1(String name) {

        return mongoPersonRepository.findByName(name);

    }

    @RequestMapping("q2")
    public List<Person> q2(Integer age) {
        return mongoPersonRepository.withQueryFindByAge(age);

    }

}

package com.zn.springbootdemo.data.mongo;

import com.zn.springbootdemo.data.mongo.bean.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by ning on 5/9/18.
 */

public interface MongoPersonRepository extends MongoRepository<Person, String> {

    //支持方法名查询
    Person findByName(String name);


    //支持Query查询
    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);


}

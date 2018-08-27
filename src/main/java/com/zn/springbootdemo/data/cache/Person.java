package com.zn.springbootdemo.data.cache;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ning on 24/8/18.
 * 缓存对象
 */
@Data
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String address;

    private Integer age;

    public Person() {
        super();
    }

    public Person(Long id, String name, String address, Integer age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

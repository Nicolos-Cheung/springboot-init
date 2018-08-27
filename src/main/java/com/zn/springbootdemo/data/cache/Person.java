package com.zn.springbootdemo.data.cache;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by ning on 24/8/18.
 * 缓存对象
 */
@Entity
public class Person implements Serializable {

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

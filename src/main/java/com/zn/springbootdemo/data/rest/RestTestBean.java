package com.zn.springbootdemo.data.rest;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ning on 24/8/18.
 * <p>
 * Spring data Rest测试相关bean
 */
@Entity
@Data
public class RestTestBean {

    @Id  //主键
    @GeneratedValue(strategy = GenerationType.AUTO) //自增
    private Long id;

    private String caseName;

    private String tag;

    public RestTestBean() {
        super();
    }

    public RestTestBean(String caseName, String tag) {
        this.caseName = caseName;
        this.tag = tag;
    }
}

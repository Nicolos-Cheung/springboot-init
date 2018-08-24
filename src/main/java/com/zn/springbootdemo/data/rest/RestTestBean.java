package com.zn.springbootdemo.data.rest;

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
public class RestTestBean {

    @Id  //主键
    @GeneratedValue(strategy = GenerationType.AUTO) //自增
    private Long id;

    private String caseName;

    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public RestTestBean() {
        super();
    }

    public RestTestBean(String caseName, String tag) {
        this.caseName = caseName;
        this.tag = tag;
    }
}

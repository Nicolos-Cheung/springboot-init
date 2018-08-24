package com.zn.springbootdemo.controller;

import com.zn.springbootdemo.domain.JsonData;
import com.zn.springbootdemo.jpa.JPATestRepostitory;
import com.zn.springbootdemo.jpa.JpaBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by ning on 24/8/18.
 */
@RestController
@RequestMapping("jpa")
@Api(value = "测试Spring-data-JPA", description = "测试Spring-data-JPA")
public class JPATestController {

    @Autowired
    JPATestRepostitory jpaTestRepostitory;

    @RequestMapping(value = "/save")
    public Object save(@Valid String caseName, @Valid String tag, BindingResult result) {
        JpaBean p;
        if (!result.hasErrors()) {
            p = jpaTestRepostitory.save(new JpaBean(caseName, tag));
            return JsonData.buildSuccess(p);
        } else {
            return JsonData.buildError(result.getFieldError().getDefaultMessage());
        }


    }

}

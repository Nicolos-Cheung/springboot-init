package com.zn.springbootdemo.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by ning on 24/8/18.
 */
@Entity  //指明是数据库表映射实体类
@Data
public class JpaBean {

    @Id  //主键
    @GeneratedValue(strategy = GenerationType.AUTO) //自增
    private Long id;

    @NotNull(message = "caseName不能为空")
    private String caseName;

    @NotNull(message = "tag不能为空")
    private String tag;

    public JpaBean(String caseName, String tag) {
        this.caseName = caseName;
        this.tag = tag;
    }

    public JpaBean() {

    }
}

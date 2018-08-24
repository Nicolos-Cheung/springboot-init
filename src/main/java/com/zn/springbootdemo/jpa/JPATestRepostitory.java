package com.zn.springbootdemo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by ning on 24/8/18.
 * <p>
 * JPA多种查询方式
 */
public interface JPATestRepostitory extends JpaRepository<JpaBean, Long> {

    List<JpaBean> findByCaseName(String caseName);

    List<JpaBean> findByTagLike(String tag);

    List<JpaBean> findFirst5ByCaseName(String caseName);

    @Query("select j.caseName from JpaBean j where j.id = :id")
    String findCaseNameById(@Param("id") Long id);

}

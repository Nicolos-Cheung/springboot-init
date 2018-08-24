package com.zn.springbootdemo.data.rest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by ning on 24/8/18.
 */

//@RepositoryRestResource(path = "rest")
public interface RestTestRepostitory extends JpaRepository<RestTestBean, Long> {

    /**
     * 自定义jpa方法暴露为REST资源
     * 请求URL: http://localhost:8080/restTestBeans/search/nameStartsWith?caseName=xxx
     */
    @RestResource(path = "nameStartsWith", rel = "nameStartsWith")
    RestTestBean findByCaseNameStartsWith(@Param("caseName") String caseName);

}

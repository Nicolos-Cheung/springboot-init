package com.zn.springbootdemo.data.cache;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ning on 24/8/18.
 */
public interface PersonRepository  extends JpaRepository<Person,Long>{
    
}

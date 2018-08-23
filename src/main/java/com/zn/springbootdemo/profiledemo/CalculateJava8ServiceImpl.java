package com.zn.springbootdemo.profiledemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Created by ning on 15/8/18.
 * JAVA8相关事件
 */
@Profile("Java8")
@Service
public class CalculateJava8ServiceImpl implements CalculateService {

    @Override
    public Integer sum(Integer... values) {

        System.out.println("JAVA8 Stream 计算...");

        return Stream.of(values).reduce(0, Integer::sum);
    }
}

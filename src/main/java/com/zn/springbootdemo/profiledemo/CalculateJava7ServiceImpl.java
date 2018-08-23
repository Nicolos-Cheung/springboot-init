package com.zn.springbootdemo.profiledemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ning on 15/8/18.
 */
@Profile("Java7")
@Service
public class CalculateJava7ServiceImpl implements CalculateService {

    @Override
    public Integer sum(Integer... values) {

        System.out.println("JAVA7 foreach 计算...");

        Integer sum = 0;
        for (Integer i : values) {
            sum += i;
        }
        return sum;
    }
}

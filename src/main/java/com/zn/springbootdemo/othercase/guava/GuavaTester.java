package com.zn.springbootdemo.othercase.guava;

import com.google.common.base.Optional;

/**
 * Created by ning on 5/9/18.
 */
public class GuavaTester {

    public static void main(String args[]) {
        GuavaTester guavaTester = new GuavaTester();

        Integer invalidInput = null;
//        Optional<Integer> a = Optional.of(invalidInput); //输入如果为空，则抛出异常
        Optional<Integer> a = Optional.fromNullable(invalidInput);
        Optional<Integer> b = Optional.of(new Integer(10));
        System.out.println(guavaTester.sum(a, b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());

        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.or - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.or(new Integer(0)); //如果a中的值为null，则返回or传入的值

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();

        return value1 + value2;
    }
}

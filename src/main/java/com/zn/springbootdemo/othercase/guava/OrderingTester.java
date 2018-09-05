package com.zn.springbootdemo.othercase.guava;

import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ning on 5/9/18.
 * <p>
 * Ordering(排序)可以被看作是一个丰富的比较具有增强功能的链接，多个实用方法，多类型排序功能等
 */
public class OrderingTester {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 1, 4, 5, 3, 2, 6, 10, 9);

        Ordering ordering = Ordering.natural();
        Collections.sort(numbers, ordering);
        System.out.println("List is sorted: " + ordering.isOrdered(numbers));
        System.out.println("Minimum: " + ordering.min(numbers));
        System.out.println("Maximum: " + ordering.max(numbers));
    }
}

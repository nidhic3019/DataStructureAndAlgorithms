/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;

public class Sorting3 {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Nidhi", "Amit", "Jack", "Jane", "Bryan", "Crick", "John");

        nameList.parallelStream()
                .filter(s -> {
                    System.out.format("filter:  %s [%s]\n", s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map:     %s [%s]\n", s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sort:    %s --> %s [%s]\n", s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n", s, Thread.currentThread().getName()));
    }
}

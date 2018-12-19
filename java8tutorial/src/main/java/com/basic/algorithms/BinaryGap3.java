/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.basic.algorithms;

import java.util.stream.Stream;

public class BinaryGap3 {

    public static void main(String[] args) {

        int N = 1041;

        Stream<String> split = Stream.of(Integer.toBinaryString(N).split("1+"));

        Integer integer = split.filter(a -> {
            System.out.println("Filter---> " + a);
            return a != null;
        })
                .map(x -> {
                    System.out.println("map--->" + x);
                    return x.length();

                })
                .max((x, y) -> {
                    System.out.println("map---> x= " + x + " y= " + y);
                    return Integer.compare(x, y);
                })
                .orElse(0);
        System.out.println(integer);
    }
}

/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStream3 {

    public static void main(String[] args) {

        //using mapToDouble
        Stream.of(new BigDecimal(55.23), new BigDecimal(88.30))
                .mapToDouble(BigDecimal::doubleValue)
                .average()
                .ifPresent(System.out::println);


        //find avergate
        IntStream.rangeClosed(1, 10)
                .average()
                .ifPresent(System.out::println);

        //Builder can be used with Intstream/DoubleStream to build an input stream
        DoubleStream.builder()
                .add(500)
                .add(822.50)
                .add(989.55)
                .build()
                .sorted()
                .forEach(System.out::println);

        int[] ints = {9, 13, 15, 17, 11};
        Arrays.stream(ints)
                .average()
                .ifPresent(System.out::println);
    }
}

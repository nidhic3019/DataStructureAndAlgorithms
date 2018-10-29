/*
 * Created on 2018. by Nidhi Chourasia
 */
package com.basic.programs.fibonacci;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Java 8 / Lambda approach to generate fibonacci series.
 * Fibonacci always start as classic (e.g. 0, 1, 1, 2, 3, 5)
 */

public class FibonacciSeries {
    //chnage the MAX_VALUE to print fibonacci series at given range
    private static final BigInteger MAX_SIZE = BigInteger.valueOf(5);

    public static void main(String[] args) {

        List<BigInteger> fibonacciSeries = generateFibonacciSeries();

        System.out.println("-------------------Fibonacci Series----------------------");
        System.out.println(fibonacciSeries);
        System.out.println("-------------------****************----------------------");
    }

    private static List<BigInteger> generateFibonacciSeries() {
        return Stream.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE},
                (tuple) -> new BigInteger[]{tuple[1], (tuple[0].add(tuple[1]))})

                .limit(MAX_SIZE.longValue())
                .map(n -> n[0])
                .collect(toList());
    }
}

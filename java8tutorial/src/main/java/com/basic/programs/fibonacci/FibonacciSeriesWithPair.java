/*
 * Created on 2018. by Nidhi Chourasia
 */

package com.basic.programs.fibonacci;

import javafx.util.Pair;

import java.math.BigInteger;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FibonacciSeriesWithPair {

    //chnage the MAX_VALUE to print fibonacci series at given range
    private static final BigInteger MAX_SIZE = BigInteger.valueOf(15);

    public static void main(String[] args) {

        List<BigInteger> fibonacciSeries = generateFibonacciSeries();

        System.out.println("-------------------Fibonacci Series----------------------");
        System.out.println(fibonacciSeries);
        System.out.println("-------------------****************----------------------");
    }

    private static List<BigInteger> generateFibonacciSeries() {

        Pair<BigInteger, BigInteger> seed = new Pair<>(BigInteger.ZERO, BigInteger.ONE);

        UnaryOperator<Pair<BigInteger, BigInteger>> f = x -> new Pair<>(x.getValue(), x.getKey().add(x.getValue()));

        return Stream.iterate(seed, f)
                .limit(MAX_SIZE.longValue())
                .map(n -> n.getKey())
                .collect(toList());
    }
}

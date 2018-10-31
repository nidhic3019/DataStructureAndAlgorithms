/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStream4 {

    public static void main(String[] args) {

        //generating numbers through Math.random()
        int[] ints = IntStream.generate(() -> (int) (Math.random() * 7))
                .limit(5)
                .toArray();
        System.out.println(Arrays.toString(ints));

        int[] nums = IntStream.iterate(1, n -> n * 2)
                .limit(20)
                .toArray();
        System.out.println(Arrays.toString(nums));

    }
}

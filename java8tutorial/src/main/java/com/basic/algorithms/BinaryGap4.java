/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.basic.algorithms;

import java.util.stream.Stream;

public class BinaryGap4 {

    /*
     * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001
     * and so its longest binary gap is of length 5.
     * Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.*/

    public static void main(String[] args) {
        int N = 5;
        Integer maxbinaryGap = Stream.of(Integer.toBinaryString(N).replaceAll("0+$", "").split("1"))
                .filter(s -> !s.isEmpty())
                .map(s -> s.length())
                .max(Integer::compare)
                .orElse(0);

        System.out.println("binary String of Number: N = " + Integer.toBinaryString(N) + " And Binary Gap is " + maxbinaryGap);
    }
}

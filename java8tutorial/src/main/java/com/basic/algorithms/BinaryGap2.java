/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.basic.algorithms;

public class BinaryGap2 {

    public static void main(String[] args) {
        int N = 32;
        System.out.println("binary String of Number: N = " + Integer.toBinaryString(N) + " And Binary Gap is " + solution(N));
    }

    static int solution(int n) {
        return solution(n, 0, 0);
    }

    static int solution(int n, int max, int current) {
        if (n == 0)
            return max;
        else if (n % 2 == 0)
            return solution(n / 2, max, current + 1);
        else
            return solution(n / 2, Math.max(max, current), 0);
    }
}

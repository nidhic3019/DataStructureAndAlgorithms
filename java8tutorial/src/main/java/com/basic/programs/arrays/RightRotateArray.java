/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.basic.programs.arrays;

import java.util.Arrays;

public class RightRotateArray {

    public static void main(String[] args) {
        int[] array = {3, 8, 9, 10, 50, 60, 100};
        int K = 7;
        Arrays.stream(array).forEach(a -> System.out.print(a + " "));
        System.out.println("\n------------");

        if (K <= array.length) {
            for (int i = 0; i < K; i++) {
                int temp = array[array.length - 1];
                for (int j = array.length - 2; j >= 0; j--) {
                    array[j + 1] = array[j];
                }
                array[0] = temp;
            }
            Arrays.stream(array).forEach(a -> System.out.print(a + " "));
        } else {
            System.out.println("Invalid Kth parameter...!!");
        }
    }
}



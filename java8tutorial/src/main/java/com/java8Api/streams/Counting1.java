/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;

public class Counting1 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Nidhi", "Anny", "Jack", "Jane", "Bryan", "Crick", "John");

        //Count elements in the list
        long count = stringList.stream()
                .count();
        System.out.println(count);

        //Count elements after filtering
        long elements = stringList.stream()
                .filter(x -> x.startsWith("J"))
                .count();
        System.out.println(elements);


    }
}

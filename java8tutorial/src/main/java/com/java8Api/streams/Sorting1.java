/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;

public class Sorting1 {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Nidhi", "Amit", "Jack", "Jane", "Bryan", "Crick", "John");

        //Sort All list elements
        System.out.println("Sort All list elements");
        nameList.stream()
                .sorted()
                .forEach(x -> System.out.println(x));

        //sort elements after filtering
        System.out.println("Sort elements after filtering");
        nameList.stream()
                .filter(i -> i.startsWith("J"))
                .sorted()
                .forEach(x -> System.out.println(x));

    }
}

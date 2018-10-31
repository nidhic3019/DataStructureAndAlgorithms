/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;

public class Matching1 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Nidhi", "Amit", "Jack", "Jane", "Rryan", "Crick", "John");
        List<String> list2 = Arrays.asList("Jack", "Jane", "John");

        //For list1 the output returns to false and list2 is true
        boolean isMatchStartWithJ = list2.stream()
                .allMatch(x -> x.startsWith("J"));
        System.out.println(isMatchStartWithJ);

        //for any element that matches the condition will retuns true

        boolean isAnyMatch = list1.stream()
                .anyMatch(x -> x.startsWith("J"));
        System.out.println(isAnyMatch);

        boolean isNoMatch = list1.stream()
                .noneMatch(x -> x.startsWith("X"));
        System.out.println(isNoMatch);

    }
}

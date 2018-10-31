/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;

public class Mapping1 {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Nidhi", "Amit", "Jack", "Jane", "Bryan", "Crick", "John");

        //Make all the elements of list to uppercase
        System.out.println("All elements to uppercase");
        nameList.stream()
                .map(s -> s.toUpperCase())
                .forEach(x -> System.out.println(x));


        //Filter elements and than do it an uppercase
        System.out.println("Filter elements and than map to uppercase");

        nameList.stream()
                .filter(s -> s.startsWith("J"))
                .map(e -> e.toUpperCase())
                .forEach(x -> System.out.println(x));

    }
}

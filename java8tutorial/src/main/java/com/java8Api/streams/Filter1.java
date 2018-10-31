/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */
package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;


public class Filter1 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Nidhi", "Amit", "Jack", "Jane", "Bryan", "Crick", "John");

        System.out.println("Elements that start with J:");
        //Filter only elements which starts with J
        nameList.stream()
                .filter(x -> x.startsWith("J"))
                .forEach(x -> System.out.println(x));

        System.out.println("Elements that ends with n:");

        //Filter elements that ends with n
        nameList.parallelStream()
                .filter(x -> x.endsWith("n"))
                .forEach(x -> System.out.println(x));
    }
}

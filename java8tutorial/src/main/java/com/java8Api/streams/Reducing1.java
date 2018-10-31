/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Nidhi", "Anny", "Jack", "Jane", "Margareta", "Crick", "John");

        /*Reducing is the repeated process of combining all elements.
          Reduce operation applies a binary operator to each element in the stream where the first argument
        to the operator is the return value of the previous application and second argument is the current stream
        element.*/

        Optional<String> reduce = stringList.stream()
                .sorted()
                .reduce((s, s2) -> s + "#" + s2);

        reduce.ifPresent(System.out::println);

        Optional<String> longestWord = stringList.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        longestWord.ifPresent(System.out::println);

        //Get Sum of all elements in list

        Optional<Integer> sum = Arrays.asList(5, 8, 4, 9).stream()
                .reduce((n1, n2) -> n1 + n2);
        sum.ifPresent(System.out::println);

    }
}

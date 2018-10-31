/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class IntStream1 {
    public static final int MAX = 1000000;

    public static void main(String[] args) {

        List<String> values = new ArrayList<>(MAX);

        //Using IntStream to add element in the list instead of using the traditional for loop
        IntStream.rangeClosed(0, MAX)
                .forEach(x -> values.add((UUID.randomUUID()).toString()));

        //Sorting elements using stream
        sequentialSort(values);
        //Sorting elements using Parallel stream
        parallelSort(values);
    }

    private static void sequentialSort(List<String> values) {
        Profiler.profile(() -> values.stream().sorted().count(), "stream");
    }

    private static void parallelSort(List<String> values) {
        Profiler.profile(() -> values.parallelStream().sorted().count(), "parallelStream");
    }
}

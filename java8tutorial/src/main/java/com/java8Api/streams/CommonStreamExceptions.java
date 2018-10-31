/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CommonStreamExceptions {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Nidhi", "Ammy", "Jack", "Jane", "Bryan", "Crick", "John");
        // example1(stringList);
        //example2();
        //example3(stringList);
        //example4(stringList);
        example5(stringList);
    }

    private static void test8(List<String> stringList) {
        Supplier<Stream<String>> streamSupplier =
                () -> stringList
                        .stream()
                        .filter(s -> s.startsWith("a"));

        boolean b = streamSupplier.get().anyMatch(s -> true);
        System.out.println(b);
        streamSupplier.get().noneMatch(s -> true);
    }


    // example1 and example2 : stream has already been operated upon or closed

    /*Whenever a terminal operation is called on a Stream object, the instance gets consumed and closed.
    Just comment the last line of the example1 the code runs fine.As both the operations anyMatch and noneMatch are terminal
    So using other terminal operation will cause the issue.*/

    private static void example1(List<String> stringCollection) {
        Stream<String> stream = stringCollection
                .stream()
                .filter(s -> s.startsWith("a"));

        stream.anyMatch(s -> true);
        stream.noneMatch(s -> true);
    }

    //Both .get and .findFirst are the terminal operations so cannot use stream once closed
    private static void example2() {
        Stream<String> stringStream = Stream.of("AA", "BB", "CC", "DD");
        Optional<String> result1 = stringStream.findAny();
        System.out.println(result1.get());
        Optional<String> result2 = stringStream.findFirst();
    }

    // short-circuiting can finish before transversing all the elements if condition matches.
    private static void example3(List<String> stringList) {
        boolean a = stringList.stream()
                .map(s -> {
                    System.out.println("map:      " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });

    }

    //Swap the positions of .filter and map and see the output differences
    private static void example4(List<String> stringCollection) {
        stringCollection
                .stream()
                .sorted((s1, s2) -> {
                    System.out.printf("sort:    %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter:  " + s);
                    return s.toLowerCase().startsWith("j");
                })
                .map(s -> {
                    System.out.println("map:     " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    //Use TDD to test such type of code segments
    private static void example5(List<String> stringCollection) {
        stringCollection
                .stream()
                .filter(s -> {
                    System.out.println("filter:  " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}


    /*
     *  @author
     *  Nidhi Chourasia created on 2018
     *
     */

    package com.java8Api.streams;

    import java.util.OptionalInt;
    import java.util.stream.IntStream;

    public class IntStream2 {

        /*Difference between range and rangeClosed is that
         * rangeClosed(a,b): The values from a to be are considered by incrementing 1.
         * range(a,b) : Values from a to b-1 are considered.  */

        public static void main(String[] args) {

            //find ood numbers
            IntStream.rangeClosed(0, 100)
                    .filter(x -> x % 2 != 0)
                    .forEach(x -> System.out.println(x));

            //Sum all the elements within the given range----> Output will be 10
            OptionalInt range =
                    IntStream.range(1, 5)
                            .reduce((a, b) -> a + b);
            System.out.println(range.getAsInt());

            //Sum all the elements within the given range----> Output will be 15
            OptionalInt rangeClosed =
                    IntStream.rangeClosed(1, 5)
                            .reduce((a, b) -> a + b);
            System.out.println(rangeClosed.getAsInt());

            //Finding sum
            int sum = IntStream.range(0, 100).sum();
            System.out.println(sum);

            //skip discards the given number of elements starting from first position.First 5 elements will be skipped in this example
            int sumAfterSkip = IntStream.rangeClosed(1, 10).skip(5).sum();
            System.out.println(sumAfterSkip);

            //Sorting the elements in the given range
            IntStream.of(80, 50, 10, 60, 100).sorted().forEach(s -> System.out.print(s + ","));

        }
    }

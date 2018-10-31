 /*
  *  @author
  *  Nidhi Chourasia created on 2018
  *
  */

 package com.java8Api.streams;

 import java.time.Instant;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.UUID;
 import java.util.function.Supplier;

 interface Profiler {
     static void profile(Supplier method, String message) {
         long startTime = Instant.now().toEpochMilli();
         method.get();
         long endTime = Instant.now().toEpochMilli();
         System.out.println("Time taken to sort elements using " + message + " : " + (endTime - startTime) + "millisecond");
     }
 }

 public class Sorting2 {

     public static final int MAX = 1000000;

     public static void main(String[] args) {

         List<String> values = new ArrayList<>(MAX);
         for (int i = 0; i < MAX; i++) {
             UUID uuid = UUID.randomUUID();
             values.add(uuid.toString());
         }

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

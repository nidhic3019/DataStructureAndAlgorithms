/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class EmployeeStreamImpl3 {

    public static void main(String[] args) {

        List<Employee> employeeList =
                Arrays.asList(
                        new Employee("Nidhi", 18),
                        new Employee("Jack", 23),
                        new Employee("Anny", 23),
                        new Employee("Jane", 15),
                        new Employee("Carron", 18),
                        new Employee("David", 23),
                        new Employee("Rchard", 23),
                        new Employee("stephan", 30),
                        new Employee("Robin", 40));

        //Creating Custom collectors

       /* Collector<Object, StringJoiner, String> stringJoinerSupplier = Collector.of(
                () -> new StringJoiner("-"),  //Supplier
                (StringJoiner x, Object y) -> x.add(y.toString().toUpperCase()), //accumulator
                (x1, y2) -> x1.merge(y2),//combiner
                StringJoiner::toString);  //finisher*/

        //To Understand working of the custom collector-----> Uncomment and run this code and comment the above one

        Collector<Object, StringJoiner, String> stringJoinerSupplier = Collector.of(() -> {
                    System.out.println("Supplier..");
                    return new StringJoiner("->");
                },
                (x, y) -> {
                    System.out.println("Accumulator.." + x + ".." + y);
                    x.add(y.toString().toUpperCase());
                },
                (x1, y1) -> {
                    System.out.println("Combiner..");
                    return x1.merge(y1);
                },
                joiner -> {
                    System.out.println("finisher..");
                    return joiner.toString();
                });


        String collect = employeeList.stream()
                .map(e -> e.getEmpName())
                .collect(stringJoinerSupplier);
        System.out.println(collect);
    }
}

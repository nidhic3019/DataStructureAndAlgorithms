/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamImpl2 {

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

        //To find the Maz age
        employeeList.stream()
                .reduce((x, y) -> x.getAge() > y.getAge() ? x : y)
                .ifPresent(System.out::println);

        //To Understand its working uncomment the following code snippet
       /* employeeList.stream()
                .reduce((x, y) -> {
                    System.out.println(x + ".." + y);
                    return x.getAge() > y.getAge() ? x : y;
                })
                .ifPresent(System.out::println);*/

        //Do the sum of ages
        int value = employeeList.stream()
                .reduce(0, (sum, e) -> {
                            System.out.println("sum=" + sum + ".." + e);
                            return sum += e.getAge();
                        },
                        (x, y) -> {
                            System.out.println(x + ".." + y);
                            return (x + y);
                        });
        System.out.println(value);

        //Above can be written as
       /* Integer reduce = employeeList.stream()
                .reduce(0, (sum, e) -> sum += e.getAge(), (e1, e2) -> e1 + e2);
        System.out.println(reduce);*/


        //or other way to write code using parallel stream
        Integer ageSum = employeeList
                .parallelStream()
                .reduce(0,
                        (sum, e) -> {
                            System.out.format("accumulator: sum=%s; employee=%s; thread=%s\n",
                                    sum, e, Thread.currentThread().getName());
                            return sum += e.getAge();
                        },
                        (e1, e2) -> {
                            System.out.format("combiner: e1=%s; e2=%s; thread=%s\n",
                                    e1, e2, Thread.currentThread().getName());
                            return e1 + e2;
                        });

        System.out.println(ageSum);


    }
}

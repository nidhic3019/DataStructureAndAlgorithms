/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamImpl1 {

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

        //Group Employee based on the age
        Map<Integer, List<Employee>> employeesByAge = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getAge()));
        System.out.println(employeesByAge);

        Map<Integer, String> employeesByAge2 = employeeList.stream()
                .collect(Collectors.toMap(
                        e -> e.getAge(),
                        e -> e.getEmpName(),
                        (name1, name2) -> name1 + "," + name2)
                );
        System.out.println(employeesByAge2);

        //Find Average age of the employees
        Double averaeAge = employeeList.stream()
                .collect(Collectors.averagingInt(e -> e.getAge()));

        System.out.println(averaeAge);

        //Summarizing details
        DoubleSummaryStatistics employeeSummary = employeeList.stream()
                .collect(Collectors.summarizingDouble(e -> e.getAge()));
        System.out.println(employeeSummary);

        //get only those names of the employees whose age is greater than 23
        List<String> employeeNames = employeeList.stream()
                .filter(e -> e.getAge() > 23)
                .map(e -> e.getEmpName())
                .collect(Collectors.toList());
        System.out.println(employeeNames);

        //print all employess names with comma seperated
        String names = employeeList.stream()
                .map(e -> e.getEmpName())
                .collect(Collectors.joining(","));
        System.out.println(names);

    }
}

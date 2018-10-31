/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.java8Api.streams;

public class Employee {

    private String empName;
    private int age;

    public Employee(String empName, int age) {
        this.empName = empName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }
}

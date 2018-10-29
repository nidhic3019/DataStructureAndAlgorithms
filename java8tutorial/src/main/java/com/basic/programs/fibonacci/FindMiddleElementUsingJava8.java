package com.basic.programs.fibonacci;

import java.util.LinkedList;

public class FindMiddleElementUsingJava8 {

    //Linked list should have off number of elements for better understanding how the program works
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("US");
        linkedList.add("Japan");
        linkedList.add("India");
        linkedList.add("Russia");
        linkedList.add("UK");

        Object fast = linkedList.getFirst();
        Object slow = linkedList.getFirst();

        linkedList.stream()
                .filter(x -> x == linkedList.get(linkedList.size() / 2))
                .forEach(x -> System.out.println(x));
    }

}

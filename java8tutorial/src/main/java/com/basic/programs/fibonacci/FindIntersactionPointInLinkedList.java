package com.basic.programs.fibonacci;

import static java.util.Objects.isNull;

class Node {
    Integer data;
    Node next;
}

class CustomLinkedList<T> {
    Node head = null;
    int size = 0;

    public void push(Integer data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        size++;
    }

    public Integer pop() {
        Integer data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int size() {
        return size;
    }
}

public class FindIntersactionPointInLinkedList {

    public static void main(String[] args) {
        //Logic can be applied when we know that after intersaction point both the list is pointing to same number of elements

        CustomLinkedList<Integer> firstList = new CustomLinkedList();
        firstList.push(1021);
        firstList.push(1022);
        firstList.push(1023);
        firstList.push(1054);
        firstList.push(1055);
        firstList.push(1056);
        firstList.push(8907);
        firstList.push(8908);
        firstList.push(8909);
        firstList.push(1000);

        CustomLinkedList<Integer> secondList = new CustomLinkedList();
        secondList.push(1021);
        secondList.push(1022);
        secondList.push(9090);
        secondList.push(8776);
        secondList.push(4444);
        secondList.push(5555);
        secondList.push(6666);
        secondList.push(5940);
        secondList.push(0000);
        secondList.push(9043);
        secondList.push(2345);
        secondList.push(1234);

        System.out.println(firstList.size());
        System.out.println(secondList.size());
        Integer intesactionPoint = findIntesactionPoint(firstList, secondList);
        System.out.println("List Intersact at element: " + intesactionPoint);
    }

    private static Integer findIntesactionPoint(CustomLinkedList<Integer> firstList, CustomLinkedList<Integer> secondList) {
        Node first = firstList.head, second = secondList.head;
        if (IsIntersectionPointexists(firstList, secondList)) {

            int firstListSize = firstList.size();
            int secondListSize = secondList.size();

            if (firstListSize > secondListSize) {
                first = IterateList(firstListSize - secondListSize, firstList.head);
            } else {
                second = IterateList(secondListSize - firstListSize, secondList.head);
            }

            while (!(first.data).equals(second.data)) {
                first = first.next;
                second = second.next;

            }
        }
        return first.data;
    }

    private static Node IterateList(int noOfNodesToexecute, Node node) {
        for (int i = 0; i < noOfNodesToexecute; i++) {
            node = node.next;
        }
        return node;
    }

    private static boolean IsIntersectionPointexists(CustomLinkedList<Integer> firstList, CustomLinkedList<Integer> secondList) {
        Node tail1 = IterateAndGetTail(firstList);
        Node tail2 = IterateAndGetTail(secondList);

        if (tail1.data.equals(tail2.data)) {
            return true;
        }
        return false;

    }

    private static Node IterateAndGetTail(CustomLinkedList<Integer> list) {
        Node current = list.head;
        for (int i = 0; i < list.size(); i++) {
            if (isNull(current) || isNull(current.next)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

}

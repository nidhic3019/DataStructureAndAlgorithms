package com.basic.programs.fibonacci;


import static java.util.Objects.isNull;

public class LinkedListImpl<T> {

    private Integer size = 0;
    private Node head = null;

    class Node {
        private T data;
        private Node next;

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    public Node get() {
        return head;
    }

    public void push(T data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        size++;
    }

    public T pop() {
        Object result = head.data;
        head = head.next;
        size--;
        return (T) result;
    }

    public boolean isEmpty() {
        return isNull(head);
    }

    public Integer size() {
        return size;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "->");
            current = current.next;
        }
    }
}

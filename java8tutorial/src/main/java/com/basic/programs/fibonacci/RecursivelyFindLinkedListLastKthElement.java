package com.basic.programs.fibonacci;

import static java.lang.String.valueOf;

public class RecursivelyFindLinkedListLastKthElement {
    private static int value;

    public static void main(String[] args) {
        int K = 3;
        LinkedListImpl<String> linkedList = new LinkedListImpl();
        linkedList.push("Nidhi");
        linkedList.push("Vivek");
        linkedList.push("Yashi");
        linkedList.push("Jane");
        linkedList.push("Jack");
        linkedList.push("Ryan");
        linkedList.print();
        String kthElement = getKthElement(linkedList, K);
        System.out.println("Last " + K + "Kth element in the List...." + kthElement);
    }

    private static String getKthElement(LinkedListImpl linkedList, int K) {
        if (linkedList.isEmpty()) {
            throw new RuntimeException("Exception occured: List is Empty");
        }

        if (linkedList.size() < K) {
            throw new RuntimeException("Exception occured: No such element found");
        }
        LinkedListImpl.Node kthElementFromlast = findKthElementFromlast(linkedList.get(), K);
        return valueOf(kthElementFromlast.getData());
    }

    private static LinkedListImpl.Node findKthElementFromlast(LinkedListImpl.Node node, int k) {
        if (node == null) {
            return null;
        }
        LinkedListImpl.Node element = findKthElementFromlast(node.getNext(), k);
        value = value + 1;

        if (value == k) {
            return node;
        }
        return element;
    }

}

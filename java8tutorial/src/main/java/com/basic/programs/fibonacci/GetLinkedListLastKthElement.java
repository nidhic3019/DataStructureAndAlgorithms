package com.basic.programs.fibonacci;

public class GetLinkedListLastKthElement {

    public static void main(String[] args) {
        int k = 7;
        LinkedListImpl<Integer> linkedList = new LinkedListImpl();

        linkedList.push(1021);
        linkedList.push(1022);
        linkedList.push(1023);
        linkedList.push(1054);
        linkedList.push(1055);
        linkedList.push(1056);
        linkedList.push(8907);
        linkedList.push(8908);
        linkedList.push(8909);
        linkedList.push(1000);

        findLastKthElement(linkedList, k);
    }

    private static void findLastKthElement(LinkedListImpl linkedList, int k) {
        LinkedListImpl.Node node = linkedList.get();// Give you  head of the linked list
        LinkedListImpl.Node currentNode = node;
        LinkedListImpl.Node kthNode = node;

        //current node pointer is moved to the kth element, so the differnece between element remain same.
        if (linkedList.size() < k) {
            throw new RuntimeException("Exception Occured: Out of bound ");
        }
        for (int i = 0; i < k; i++) {
            if (currentNode != null)
                currentNode = currentNode.getNext();
        }

        while (currentNode != null) {
            currentNode = currentNode.getNext();
            kthNode = kthNode.getNext();
        }
        System.out.println(k + "Kth element: " + kthNode.getData());
    }
}

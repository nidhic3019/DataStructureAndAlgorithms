package com.basic.programs.fibonacci;


import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class FindMiddleElement<integer> {

//    used Custom LinkedListImpl class
//   To find middle element when we have Odd number of element in list. If one elemwnt is in linkedlisst same will be returned

    public static void main(String[] args) {
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

        LinkedListImpl.Node node = GetMiddleElement(linkedList);
        System.out.println(node.getData());
    }

    private static LinkedListImpl.Node GetMiddleElement(LinkedListImpl<Integer> linkedList) {
        //get head of linked list
        if (isNull(linkedList) || linkedList.size() == 0)
            throw new RuntimeException("No element in List.....");

        LinkedListImpl.Node fast = linkedList.get();
        LinkedListImpl.Node slow = linkedList.get();

        while (nonNull(fast.getNext()) && nonNull(fast.getNext().getNext())) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }
}


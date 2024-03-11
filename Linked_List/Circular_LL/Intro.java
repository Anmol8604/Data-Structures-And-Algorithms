package Linked_List.Circular_LL;

import Linked_List.Node;

public class Intro {
    // In circular linked list next of last node is not null rather it is head of the linked list.

    /*
    Advantages of linked-list
    - we can traverse a whole list from any node.
    - Implementation of algorithms like round-robin
    - We can insert at the beginning and end of the linked list by just maintaining one tail reference.

    Disadvantages of linked-list
    - Implementations of operations become complex.
    */

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
    }


}

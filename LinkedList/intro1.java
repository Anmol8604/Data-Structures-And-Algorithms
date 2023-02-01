package LinkedList;

// Simple Linked List Implementation in Java.

class Node {
     int data;
     Node next;
     Node(int x) {
          data = x;
          next = null;
     }
         
}
public class intro1 {
     public static void main(String[] args) {
          Node head1 = new Node(10);
          Node temp1 = new Node(20);
          Node temp2 = new Node(30);
          head1.next = temp1;
          temp1.next = temp2;
          
     }
}
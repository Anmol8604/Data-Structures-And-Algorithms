package LinkedList;

// Inset at Begnning of singly linked list.

class Node{
     int data;
     Node next;
     Node(int x) {
          data = x;
          next = null;
     }
}
public class InsertAtBegnning {
     static Node insert(Node head, int x) {
          Node curr  = new Node(x);
          if(head == null) {
               return curr;
          }
          else {
               curr.next = head;
          }
          return curr;
     }
     static void display(Node head) {
          Node curr = head;
          while(curr != null) {
               System.out.print (curr.data + " ");
               curr = curr.next;
          }
     }
     public static void main(String[] args) {
          Node head = new Node(10);
          head.next = new Node(20);
          head.next.next = new Node(30);
          int q = 5;
          head = insert(head, q);
          display(head);   
     }
}

package LinkedList;

// Traversing s Singly Linked List in Java

class Node{
     int data;
     Node next;
     Node(int x) {
          data = x;
          next = null;
     }
}

public class intro2 {
     static void display(Node head) {
          Node curr = head;
          while(curr != null) {
               System.out.print (curr.data + " ");
               curr = curr.next;
          } 
     }
     public static void main(String[] args) {
          Node head1 = new Node(10);
          Node head2 = new Node(20);
          Node head3 = new Node(30);
          head1.next = head2; 
          head2.next = head3;
          display(head1);
          System.out.println();
          displayRecursive(head1);
     }

     static void displayRecursive(Node head1) {
          if(head1 == null){
               return;
          }
          System.out.print(head1.data + " "); 
          displayRecursive(head1.next);
     }
}

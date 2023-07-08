package Linked_List;

public class ReverseDLL {
    Node head;

    public static void main(String[] args) {
        ReverseDLL linkedlist = new ReverseDLL();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);
        linkedlist.display();
        System.out.println("Reverse Doubly Linked-list");
        linkedlist.reverse();
        linkedlist.display();
    }

    void reverse() {
        if(head != null || head.next != null){
            Node temp = head;
            Node curr = head;

            while(curr != null) {
                temp = curr.prev;
                curr.prev = curr.next;
                curr.next = temp;
                curr = curr.prev;
            }
            head = temp.prev;
        }
    }

    void add(int val) {
        Node curr = new Node(val);
        if(head == null) {
            head = curr;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = curr;
        curr.prev = temp;
    }

    void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val);
        System.out.println();
    }
}

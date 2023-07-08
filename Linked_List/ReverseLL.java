package Linked_List;

public class ReverseLL {
    Node head;

    public static void main(String[] args) {
        ReverseLL linkedlist = new ReverseLL();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);
        linkedlist.display();
        System.out.println("Reverse Singly Linked-list");
        linkedlist.reverse();
        linkedlist.display();
    }

    void reverse() {
        if(head == null || head.next == null){
            System.out.print("");
        }
        else {
            Node temp = head;
            Node curr = null;
            while(temp != null) {
                Node pre  = temp.next;
                temp.next = curr;
                curr = temp;
                temp = pre;
            }
            head = curr;
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

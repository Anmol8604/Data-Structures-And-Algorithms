package Linked_List;

public class DllIntro {
    Node head;
    public static void main(String[] args) {
        DllIntro linkedlist = new DllIntro();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);
        linkedlist.display();

        linkedlist.addf(2);
        linkedlist.addf(5);
        linkedlist.display();
    }

    void addf(int val) {
        Node curr = new Node(val);
        curr.next = head;
        head.prev = curr;
        head = curr;
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
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

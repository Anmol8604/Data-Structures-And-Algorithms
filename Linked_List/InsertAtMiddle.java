package Linked_List;

public class InsertAtMiddle {
    Node head;
    int size;
    public static void main(String[] args) {
        InsertAtMiddle linkedlist = new InsertAtMiddle();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);

        linkedlist.display();

        linkedlist.insertAT_Middle(25, 5);

        linkedlist.display();
    }

    void insertAT_Middle(int val, int pos) {
        if(pos < 1 || pos > size+1) {
            System.out.println("Invalid Position");
            return;
        }
        else if (pos == 1) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        else if(pos == size+1) {
            Node one = head;
            while(one.next != null) {
                one = one.next;
            }
            Node temp = new Node(val);
            one.next = temp;
            size++;
        }
        else {
            int curr = 2;
            Node temp = new Node(val);
            Node one = head;
            while(curr < pos) {
                one = one.next;
                curr++;
            }
            Node hello = one.next;
            one.next = temp;
            temp.next = hello;
            size++;
        }
    }

    void add(int val) {
        Node curr = new Node(val);
        if(head == null) {
            size = 1;
            head = curr;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = curr;
        size++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

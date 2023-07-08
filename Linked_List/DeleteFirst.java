package Linked_List;

public class DeleteFirst {
    static Node head;
    public static void main(String[] args) {
        DeleteFirst linkedlist = new DeleteFirst();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);

        linkedlist.display();

        linkedlist.deleteF();

        linkedlist.display();
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
    void deleteF() {
        Node curr = head;
        head = curr.next;
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

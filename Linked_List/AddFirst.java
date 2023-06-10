package Linked_List;

public class AddFirst {
    static Node head;
    public static void main(String[] args) {
        AddFirst linkedlist = new AddFirst();
        linkedlist.addf(10);
        linkedlist.addf(20);
        linkedlist.addf(30);

        linkedlist.display();
    }

    void addf(int val) {
        Node curr = new Node(val);
        curr.next = head;
        head = curr;
        return;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        return;
    }
}

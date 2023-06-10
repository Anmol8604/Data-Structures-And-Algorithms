package Linked_List;

public class AddLast {
    static Node head;
    public static void main(String[] args) {
        AddLast linkedlist = new AddLast();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);

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

package Linked_List;

public class DeleteLast {
    static Node head;
    public static void main(String[] args) {
        DeleteLast linkedlist = new DeleteLast();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);

        linkedlist.display();

        linkedlist.deleteL();

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
    void deleteL() {
        Node curr = head;
        if(head.next == null) {
            head = null;
            return;
        }
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
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

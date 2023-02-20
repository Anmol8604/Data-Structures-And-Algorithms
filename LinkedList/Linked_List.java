package LinkedList;

import javax.sound.midi.Soundbank;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Linked_List {
    static Node head;
    Linked_List() {
        head = null;
    }
    static Linked_List insert(Linked_List li, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return li;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return li;
    }
    static Linked_List insertAtFirst(Linked_List li, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return li;
    }

    static Linked_List insertAtMiddle(Linked_List li, int data, int pos) {
        if(pos == 1) {
            insertAtFirst(li, data);
            return li;
        }
        else if(pos == size()+1) {
            insert(li, data);
            return li;
        }
        else {
            Node newNode = new Node(data);
            Node temp = head;
            int count = 0;
            while (++count != pos-1) {
                temp = temp.next;
                if(temp == null) return li;
            }
            Node part2 = temp.next;
            temp.next = newNode;
            newNode.next = part2;
        }
        return li;
    }

    static int search(int data){
        int count = 1;
        Node temp = head;
        while (temp.data != data) {
            temp = temp.next;
            ++count;
            if(temp == null) return -1;
        }
        return count;
    }
    static int size() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    static Linked_List deleteFirst(Linked_List li) {
        if(head == null) return null;
        Node newNode = head.next;
        head = newNode;
        return li;
    }

    static Linked_List deleteLast(Linked_List li) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return li;
    }
    public static void main(String[] args) {
        Linked_List li = new Linked_List();
        li = insert(li, 10);
        li = insert(li, 20);
        li = insert(li, 30);
        li = insert(li, 40);
        li = insert(li, 50);
        System.out.print("Linked List : ");
        display();

        int length = size();
        System.out.println("Size of Linked List : " + length);

        li = insertAtFirst(li, 5);
        System.out.print("Linked List after inserting a Node at beginning : ");
        display();

        li = deleteFirst(li);
        System.out.print("Linked List after deletion of first Node : ");
        display();

        li = deleteLast(li);
        System.out.print("Linked List after deletion of last Node : ");
        display();

        li = insertAtMiddle(li, 15, 2);
        System.out.print("Linked List after inserting a Node at given position : ");
        display();

        li = insertAtMiddle(li, 25, 4);
        System.out.print("Linked List after inserting a Node at given position : ");
        display();

        li = insertAtMiddle(li, 35, 6);
        System.out.print("Linked List after inserting a Node at given position : ");
        display();

        int index;
        index = search(30);
        if(index == -1) System.out.println("Element not found in Linked List");
        else System.out.println("Element found at position : " + index);

        index = search(10);
        if(index == -1) System.out.println("Element not found in Linked List");
        else System.out.println("Element found at position : " + index);

        index = search(90);
        if(index == -1) System.out.println("Element not found in Linked List");
        else System.out.println("Element found at position : " + index);


    }
    static void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
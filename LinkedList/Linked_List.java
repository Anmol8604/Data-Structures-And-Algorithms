package LinkedList;

import java.sql.SQLOutput;

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
        return li;
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
        System.out.print("Linked List : ");
        display();

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
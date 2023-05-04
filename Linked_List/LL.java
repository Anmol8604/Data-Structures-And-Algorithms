package Linked_List;

import java.sql.SQLOutput;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}
public class LL {
    static Node head;
    public static void main(String[] args) {
        LL list = new LL();
        list.add("this");
        list.add("is");
        list.add("a");
        list.add("demo");
        list.add("Linked");
        list.add("List");
        list.addFirst("Hello,");
        list.addFirst("Hii,");
        display();

        list.delF();
        display();
        list.delL();
        display();
        list.delL();
        display();
    }

    static void display() {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static void add(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
            return;
        }
    }

    static void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else {
            newNode.next = head;
            head = newNode;
            return;
        }
    }

    static void delF(){
        if(head == null || head.next == null) {
            head = null;
        }
        else {
            head = head.next;
        }
    }

    static void  delL(){
        if(head == null) return;
        else if(head.next == null) {
            head = null;
            return;
        }
        Node newNode = head;
        while (newNode.next.next != null) {
            newNode = newNode.next;
        }
        newNode.next = null;
    }
}
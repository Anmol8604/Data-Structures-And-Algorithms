package LinkedList;

import javax.swing.plaf.nimbus.NimbusStyle;

class Nod_e {
    int data;
    Nod_e next;
    Nod_e prev;

    Nod_e(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLL {
    static Nod_e head;
    DoublyLL(){
        head = null;
    }

    static void insert(DoublyLL li, int data){
        Nod_e newNode = new Nod_e(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Nod_e temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        DoublyLL li = new DoublyLL();
        insert(li, 12);
        insert(li, 14);
        insert(li, 16);
        insert(li, 18);

        System.out.println("Linked list : ");
        display();

        System.out.println("Reverse Linked list : ");
        revDisplay();

    }

    static void display(){
        Nod_e temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void revDisplay() {
        Nod_e temp = head;
        while(temp.next != null) {
            temp = temp.next;
            head = temp;
        }
        while(temp.prev != null) {
            head = temp;
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        if(temp.prev == null){
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }
}

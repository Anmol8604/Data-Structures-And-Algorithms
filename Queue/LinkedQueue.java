package Queue;

public class LinkedQueue {

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.dequeue();
        queue.enqueue(12);
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        queue.enqueue(13);
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        queue.dequeue();
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
    }

    public void enqueue(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void dequeue() {
        if(head == null) {
            System.out.println("Queue is Empty!!");
            return;
        }
        else {
            head = head.next;
        }
    }

    public int getFront(){
        return head.val;
    }

    public int getRear(){
        return tail.val;
    }

    public boolean isEmpty(){
        return head == null || tail == null;
    }
}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

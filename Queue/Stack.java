package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

// Implementation of Stack data structure using Queue
public class Stack {

    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(10);
        s.push(5);
        s.push(15);
        s.push(20);

        System.out.println("current size: " + s.size());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

        System.out.println("current size: " + s.size());

    }

    void pop(){
        q1.remove();
    }

    void push(int val){
        q2.add(val);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    int peek(){
        if(q1.isEmpty()) return -1;
        return q1.peek();
    }

    int size(){
        return  q1.size();
    }

}

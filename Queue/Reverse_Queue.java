package Queue;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reverse_Queue {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

//        Iterative Approach
//        reverse(queue);

        // Recursive Approach
        rev_Recursive(queue);

        System.out.println("Queue After reversing : ");
        System.out.print(queue.peek() + " ");
        queue.remove();
        System.out.print(queue.peek() + " ");
        queue.remove();
        System.out.print(queue.peek() + " ");
        queue.remove();
        System.out.print(queue.peek() + " ");
        queue.remove();
        System.out.print(queue.peek() + " ");
        queue.remove();

    }

    static void reverse(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()){
            stack.add(q.remove());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }

    }

    static void rev_Recursive(Queue<Integer> q){
        if(q.isEmpty()) return;
        int val = q.peek();
        q.remove();
        reverse(q);
        q.add(val);
    }

}

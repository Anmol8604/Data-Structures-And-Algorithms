package BinaryHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        priorityQueue.add(2);
        priorityQueue.add(4);
        priorityQueue.add(1);

        for (int i : priorityQueue) {
            System.out.print(i + " ");
        }
    }
}

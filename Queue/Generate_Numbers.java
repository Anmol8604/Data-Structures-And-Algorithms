package Queue;

import java.util.*;
import java.util.Queue;

// Generate numbers with given numbers
public class Generate_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Numbers to be generated
        int m = sc.nextInt(); // Count of given numbers

        Queue<String> queue = new ArrayDeque<>();

        for(int i = 0; i < m; i++) {
            queue.add(sc.next());
        }

        generateNumber(queue, n);

    }

    private static void generateNumber(Queue<String> queue, int n) {

        for (int i = 0; i < n; i++) {

            String a = queue.remove();
            System.out.print(a + " ") ;
            queue.add(a + 2);
            queue.add(a + 3);
        }

    }
}
package BinaryHeap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
973. K Closest Points to Origin
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

Example 1:
Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].

Example 2:
Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.

Constraints:
1 <= k <= points.length <= 104
-104 <= xi, yi <= 104
 */

public class K_ClosestPoints_to_Origin {
    public static void main(String[] args) {

    }

    public int[][] kClosest(int[][] points, int k) {
        Map<Integer[], Double> map = new HashMap<>();

        for(int[] i : points){
            Double j = Math.pow(i[0], 2) + Math.pow(i[1], 2);
            map.put(new Integer[]{Integer.valueOf(i[0]), Integer.valueOf(i[1])}, j);
        }

        PriorityQueue<Integer[]> queue = new PriorityQueue<>(
                (n, m) -> map.get(n) <= map.get(m) ? 1 : -1
        );

        for(Integer[] i : map.keySet()){
            queue.add(i);
            if(queue.size() > k) {
                queue.poll();
            }
        }

        int[][] arr =new int[k][2];
        int i = 0;
        for(Integer[] m :  queue){
            arr[i][0] =  m[0];
            arr[i++][1] =  m[1];
        }
        return arr;
    }
}

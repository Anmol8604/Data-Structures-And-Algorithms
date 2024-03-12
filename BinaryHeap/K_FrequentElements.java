package BinaryHeap;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

/*
347. Top K Frequent Elements
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 */

public class K_FrequentElements {
    public static void main(String[] args) {

    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(
                (a, b) -> map.get(a) > map.get(b) ? 1 : -1
        );

        for(int i : map.keySet()){
            queue.add(i);
            if(queue.size() > k) {
                queue.poll();
            }
        }

        int[] ans = new int[k];
        int j = 0;

        for(int i : queue){
            ans[j++] = i;
        }

        return ans;
    }
}

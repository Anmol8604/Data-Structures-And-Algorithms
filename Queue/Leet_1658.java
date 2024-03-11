package Queue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

// Minimum Operations to Reduce X to Zero
/*
You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.

Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.

Example 1:

Input: nums = [1,1,4,2,3], x = 5
Output: 2
Explanation: The optimal solution is to remove the last two elements to reduce x to zero.

Example 2:

Input: nums = [5,6,7,8,9], x = 4
Output: -1

Example 3:

Input: nums = [3,2,20,1,1,3], x = 10
Output: 5
Explanation: The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.

 */
public class Leet_1658 {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{9,1,4,2,3}, 5));
        System.out.println(minOperations(new int[]{5,6,7,8,9}, 4));
        System.out.println(minOperations(new int[]{3,2,20,1,1,3}, 10));
    }

    public static int minOperations(int[] nums, int x) {
        int ans = -1;
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        int tar = sum - x;
        sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - tar)){
                ans = Math.max(ans, i - map.get(sum - tar));
            }
            map.put(sum, i);

        }

        return ans==-1? -1:nums.length - ans;
    }
}

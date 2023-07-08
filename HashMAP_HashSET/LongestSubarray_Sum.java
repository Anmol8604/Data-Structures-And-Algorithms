package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray_Sum {
    public static void main(String[] args) {
        int arr[] = {8, 3, 1, 5, -6, 6, 2, 2};
        int sum = 4;

        System.out.println(maxLength(arr, sum));
    }

    static int maxLength(int arr[], int sum){
        Map <Integer, Integer> h = new HashMap<>();
        int max = 0;
        int presum = 0;
        for(int i = 0; i < arr.length; i++) {
            presum += arr[i];
            if(presum - sum == 0) max = i + 1;
            if(h.containsKey(presum - sum)) {
                max = Math.max(max, (i - h.get(presum - sum)));
            }
            else if(h.containsKey(presum)) {
                continue;
            }
            else {
                h.put(presum, i);
            }
        } 
        return max;
    }
}

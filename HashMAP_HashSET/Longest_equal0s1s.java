package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Longest_equal0s1s {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 0, 1, 1, 0, 1};
        int n = arr.length;

        System.out.println(equal0s1s(arr, n));
    }

    static int equal0s1s(int arr[] , int n ) {
        for(int i = 0; i < n; i++) {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }
        Map <Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == 0) max = i+1;
            if(h.containsKey(sum)) {
                max = Math.max(max, i-h.get(sum));
            }
            else {
                h.put(sum, i);
            }
        }
        return max;
    }
}

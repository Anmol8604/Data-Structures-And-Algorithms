package Hashing;

import java.util.HashMap;

// Q.  Longest Common Span with Same Sum in Binary array....

public class LongestCommonSpanwithSameSum {
     public static void main(String[] args) {
          int[] a = {1, 0, 1, 0, 0, 1, 0};
          int[] b = {0, 1, 0, 1, 0, 0, 1};

          System.out.println(commonSpan(a, b));
     }

     static int commonSpan(int[] a, int[] b) {
          int[] d = new int[a.length];
          for(int i = 0; i < d.length; i++) {
               d[i] = a[i] - b[i];
          }

          int maxLen = 0;
          int preSum = 0;

          HashMap <Integer, Integer> hm = new HashMap<>();

          for(int i = 0; i < d.length; i++) {
               preSum += d[i];

               if(preSum == 0) maxLen = i + 1;

               if(hm.containsKey(preSum))
               {
                    maxLen =  Math.max(maxLen, i - hm.get(preSum));
               }

               else {
                    hm.put(preSum, i);
               }
          }

          return maxLen;
     }
}

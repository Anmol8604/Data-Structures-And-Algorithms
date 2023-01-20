package Hashing;

import java.util.HashSet;
import java.util.Scanner;

//   Q. Find Length of the longest Consequetive  elements in the array....

//   solution :

public class LongestConsequitveSubarray {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }


     }

     static int longest(int[] arr, int n) {
          HashSet <Integer> hs = new HashSet<>();
          for(int i : arr) {
               hs.add(i);
          }
          int maxLen = 0;
          for(int i : hs) {
               int curr = 1;
               if(hs.contains(i-1) == false) {
                    while(hs.contains(i+curr)) curr++;
               }
               maxLen = Math.max(maxLen, curr);
          }
          return maxLen;
     }
}

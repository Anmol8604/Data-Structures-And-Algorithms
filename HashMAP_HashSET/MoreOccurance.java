package Hashing;

import java.util.HashMap;
import java.util.Map;

// Q. You are give with array of length n. and number k. your task is to find numbers. in array whoose occurence in araay is more than n/k/

public class MoreOccurance {
     public static void main(String[] args) {
          int[] arr = {30, 10, 20, 30, 30, 40, 30, 40, 30};
          int n =  arr.length;
          int k = 2;

          occurence(arr, n, k);
     }

     static void occurence(int[] arr, int n, int k) {
          HashMap <Integer, Integer> hs = new HashMap<>();
          for(int i : arr) {
               hs.put(i, hs.getOrDefault(i, 0)+1);
          }
          for(Map.Entry<Integer, Integer> e : hs.entrySet()) {
               if(e.getValue() > n/k){
                    System.out.println(e.getKey());
               }
          }
     }


}

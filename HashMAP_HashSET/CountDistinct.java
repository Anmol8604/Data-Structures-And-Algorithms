package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int []arr = {10, 10, 30, 40, 50};
        System.out.println(distinct(arr));
        Integer []brr = {10, 0, 30, 40, 50};
        System.out.println(Cdistinct(brr));
    }
    static int distinct(int arr[])
    {
        int n = arr.length;
        HashSet <Integer> s = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            s.add(arr[i]);
        }
        return s.size();
    }

    static int Cdistinct(Integer arr[])
    {
        HashSet <Integer> se = new HashSet<>(Arrays.asList(arr));
        return se.size();
    }
}

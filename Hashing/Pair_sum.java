package Hashing;

import java.util.HashSet;

class Pair_sum{
    public static void main(String[] args)
    {
        int arr [] = {12, 45, 23, 56, 21, 78};
        int sum = 35;

        System.out.println(Sum(arr, sum));
    }

    static boolean Sum(int arr[], int sum)
    {
        HashSet <Integer> s = new HashSet<>();
        for(int i : arr)
        {
            if(s.contains(sum - i)) return true;
            else s.add(i);
        }
        return false;
    }
}
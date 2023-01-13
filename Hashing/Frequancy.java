package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequancy {
    public static void main(String[] args) {
        int arr[] = {10, 12, 23, 34, 23 ,13, 10};

        countFrequancy(arr);
    }

    static void  countFrequancy(int arr[])
    {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
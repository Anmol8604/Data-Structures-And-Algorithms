package ArrayList;

import java.util.*;

public class MajorityElement{
    public static void main(String[] args) {
        int []arr = {11, 13, 11};
        int n = arr.length;

        System.out.println(majority(arr, n));
        System.out.println(majority(arr, n));
    }

    static int majority(int arr[], int n)
    {
        int count = 0;
        int candidate = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == candidate)
            {
                count++;
            }
            else 
            {
                count--;
                if(count == 0)
                {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for(int i = 0; i < n; i++)
        {
            if(candidate == arr[i])
            {
                count++;
            }
        }
        if(count > (n/2))
        {
            return candidate;
        }
        else{
            return -1;
        }
    }


    static int majority_naive(int arr[], int n)
    {
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count > (n/2))
            {
                return arr[i];
            }
        }
        return -1;
    }
}
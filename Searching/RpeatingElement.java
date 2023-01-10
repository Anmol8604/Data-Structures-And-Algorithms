package Searching;

import java.util.Arrays;

public class RpeatingElement {
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 3, 2, 2};
        int n = arr.length;


        System.out.println(rpeating(arr, n));
        System.out.println(effcient(arr, n));
        System.out.println(naive(arr, n));
        System.out.println(supernaive(arr, n));
        
    }

    static int rpeating(int arr[], int n)
    {
        int slow = arr[0] + 1;
        int fast = arr[0] + 1;
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow != fast);

        slow = arr[0] + 1;
        while(slow != fast)
        {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }
        return slow - 1;
    }


    static int effcient(int arr[], int n) // O(n) time, O(n) space
    {
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            if(visited[arr[i]])
            {
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return 0;
    }


    static int naive(int arr[], int n) // O(nlogn) time, O(1) space
    {
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i+1])
            {
                return arr[i];
            }
        }
        return 0;
    }



    static int supernaive(int arr[], int n) // O(n^2) time, O(1) space
    {
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return 0;
    }
}

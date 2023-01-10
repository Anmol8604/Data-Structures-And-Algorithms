package Searching; 

import java.util.*;

public class median{
    public static void main(String[] args) {
        int arr[] = {4, 5};
        int brr[] = {1, 2, 3};
        int n = arr.length + brr.length;
        System.out.println(mediantwo(arr, brr, n));
        int temp[] = new int[n];
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            temp[count] = arr[i];
            count++;   
        }
        for(int i = 0; i < brr.length; i++)
        {
            temp[count] = brr[i];
            count++;   
        }

        Arrays.sort(temp);
        for(int i = 0; i < n; i++)
        {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        System.out.println(median2(temp, count));
    }

    static double median2(int temp[], int n)
    {
        int mid = temp.length;
        if((mid%2)== 0)
        {
            mid = temp.length / 2;
            Double m =  (double) ((temp[mid] + temp[mid - 1])/2.0);
            return  m;
            // mid = temp.length / 2;
            // 
        } 

        else{
            mid = (int) (temp.length / 2.0);
            return temp[mid];
        }
    }


    static Double mediantwo(int arr[], int brr[], int n)
    {
        int na = arr.length;
        int nb = brr.length;
        if(na > nb)
        {
            int temp[] = arr;
            arr = brr;
            brr = temp;

            int temp2 = na;
            na = nb;
            nb = temp2;

        }
        int low = 0, high = na;
        
        int mid, bl;
        while (low <= high)
        {
        //     int arr[] = {1, 78, 89, 90, 100, 900};
        //     int brr[] = {10, 20, 31, 40, 50};
            mid = (low + high ) / 2;
            bl = ((n+1)/2) - mid;

            int mida = (mid == na) ? Integer.MAX_VALUE : arr[mid];
            int blm1 = (bl == 0) ? Integer.MIN_VALUE : brr[bl-1];
            int blb = (bl == nb) ? Integer.MAX_VALUE : brr[bl];
            int midam1 = (mid == 0) ? Integer.MIN_VALUE : arr[mid-1];

            if(blb < midam1)
            {
                high = mid - 1;
            }
            if(mida < blm1)
            {
                low = mid + 1;
            }
            
            else 
            {
                Double median;
                if((n%2)== 0)
                {
                    median = (double)  ( (Math.min(mida, blb) + Math.max(midam1, blm1)) )/ 2;
                }
                else 
                {
                    median = (double) Math.max(midam1, blm1);
                }
                return median;
            }
        }
        return null;
    }
    
}

package Searching;
import java.util.*;

public class bsearchinfintite {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 190, 200, 600, 700, 890, 900, 980};
        int x = 900;
        System.out.println(search(arr, x));
        Arrays.binarySearch(arr, 900);
    }

    static int search(int arr[], int x)
    {
        if(arr[0] == x)
        {
            return 0;
        }
        int i = 1;
        while(arr[i] <= x)
        {
            i = i*2;
        }
        if(arr[i] == x)
        {
            return i;
        }
        return binarySearch(arr, x, i/2 + 1, i-1);
    } 

    static int binarySearch(int arr[], int x, int low, int high)
    {
        while(low <= high)
        {
            int mid = (low + high)/2;

            if(arr[mid] == x)
            {
                return mid;
            }

            if(arr[mid] < x)
            {
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
package Searching;

public class searchinrotatrd {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 2, 3};
        int x = 3;
        int low = 0, high = arr.length-1;
        System.out.println(rotatedArray(arr, x, low, high));
    }


    static int rotatedArray(int arr[], int x, int low, int high)
    {
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == x)
            {
                return mid;
            }
            else if(arr[low] < arr[mid])
            {
                if(x > arr[low] && x < arr[mid])
                {
                    high = mid -1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if(x > arr[mid] && x <= arr[high])
                {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
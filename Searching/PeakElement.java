package Searching;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {10, 15, 13, 25, 60, 50};
        int n = arr.length;
        peakele(arr, n);
        System.out.println(getPeak(arr, n));
    }


    static int getPeak(int arr[], int n)
    {
        int low = 0, high = n - 1;
        if(n==1)
        {
            return arr[0];
        }
        while(low<=high)
        {
            int mid = (low + high)/2;
            if((mid == 0 || arr[mid - 1] <= arr[mid] ) && (mid == n-1 || arr[mid] >= arr[mid + 1]))
            {
                return mid;
            }
            else if(mid > 0 && (arr[mid -1] >= arr[mid]))
            {
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return 0;
    } 

    static void peakele(int arr[], int n)
    {
        if(n==1)
        {
            System.out.println(arr[0]);
        }
        if(arr[0] >= arr[1])
        {
            System.out.println(arr[0]);
        }
        if(arr[n-1] >= arr[n-2])
        {
            System.out.println(arr[n-1]);
        }
        for(int i = 1; i < n-1; i++)
        {
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
            {
                System.out.println(arr[i]);;
            }
        }
    }
}

package Searching;

public class count1inbinarr{
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 1, 1, 1};
        int n = arr.length;
        System.out.println(Count1(arr, n));
    }

    static int Count1(int arr[], int n) {
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==0){
                low = mid+1;
            }
            else{
                if(mid == 0 || arr[mid-1] != arr[mid])
                {
                    return n - mid;
                }
                else{
                    high = mid - 1 ;   
                }
            }
        }
        return 0;
    }
}
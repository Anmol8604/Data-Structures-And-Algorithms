package Searching;

public class AllocatePages {
    public static void main(String[] args) {
        int arr[] = {20, 30, 10, 50, 40, 30};
        int x = 3;
        int n = arr.length;

        System.out.println(minimumPages(arr, x, n));
    }

    static int minimumPages(int arr[], int x, int n)
    {
        int arrMax = arr[0];
        int arrSum = 0;
        for(int i = 0; i < n; i++)
        {
            arrMax = Math.max(arrMax, arr[i]);  
            arrSum += arr[i];
        }

        int high = arrSum;
        int low = arrMax;
        int ans = 0;
        

        while(low <= high)
        {
            int Student = 1;
            int mid = (low + high) / 2;

            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                sum += arr[i];
                if(sum > mid)
                {
                    Student++;
                    sum = arr[i];
                }
            }
            if( Student <= x)
            {
                ans = mid;
                high = mid-1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return ans;
    }
}

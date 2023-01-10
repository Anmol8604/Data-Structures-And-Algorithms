package ArrayList;

public class BEST_TIMEtobuyanssell {
    public static void main(String[] args) {
        int arr[] = {1, 6, 2, 1, 9, 9, 13};
        System.out.println(profit(arr));
    }
    static int profit(int arr[])
    {
        int profit = 0;
        int small = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < small)
            {
                small = arr[i];
            }
            profit = arr[i] - small;
            if(profit > ans)
            {
                ans = profit;
            }
        }
        return ans;
    }
}
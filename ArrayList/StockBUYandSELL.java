package ArrayList;

public class StockBUYandSELL {
    public static void main(String[] args) {
        int arr[] = {1, 6, 2, 1, 9, 0, 13};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(profit(arr, start, end));
    }
    static int profit(int arr[], int start, int end)
    {
        int profit = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] < arr[i+1])
            {
                profit += arr[i+1] - arr[i];
            }
        }
        return profit;
    }
}
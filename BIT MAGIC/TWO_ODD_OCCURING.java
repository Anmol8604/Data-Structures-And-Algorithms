import java.util.*;

public class TWO_ODD_OCCURING {

    static void method_naive(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count%2 != 0)
            {
                System.out.println(arr[i]);
            }
        }
    }


    static void efficient(int arr[], int n)
    {
        int xor = 0 , res1 = 0 , res2 = 0;
        for(int i = 0; i < n; i++)
        {
            xor = xor ^ arr[i];
        }
        int rightmost_setbit = xor & (~(xor - 1));
        for(int i = 0; i < n; i++)
        {
            if((arr[i] & rightmost_setbit) != 0){
                res1 = res1 ^ arr[i];
            }
            else{
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res1);
        System.out.println(res2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        method_naive(arr, n);
        efficient(arr, n);
    }
}
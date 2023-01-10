import java.util.Scanner;

public class ODD_OCCURRING {

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

    static void method_2(int arr[], int n)
    {
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            res = res^arr[i];
        }
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
        method_2(arr, n);
    }
}

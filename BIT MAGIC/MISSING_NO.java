import java.util.Scanner;

public class MISSING_NO {

    static void method_naive(int arr[], int n)
    {
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            res = res^arr[i];
        }
        int m = n + 1;
        for(int i = 1; i <= m; i++){
            res = res^i;
        }
        System.out.println(res);
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
    }
}

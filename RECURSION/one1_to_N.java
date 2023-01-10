import java.util.Scanner;

public class one1_to_N {
    static void fun(int n)
    {
        if (n==0)
        {
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}

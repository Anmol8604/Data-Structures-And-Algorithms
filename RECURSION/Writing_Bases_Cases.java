import java.util.Scanner;

public class Writing_Bases_Cases {
    static int fact(int n, int k)
    {
        if(n<=1)
        {
            return k;
        }
        return fact(n-1, k*n);
    }
    public static void main(String[] ars)
    {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int k = 1;
        System.out.println(fact(n, k));
        System.out.println(fib(n));
    }
    static int fib(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}

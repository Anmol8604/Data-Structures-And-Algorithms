import java.util.Scanner;

public class Tail_Recursion{
    /*
    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n -1);
        // Example of tail REcursion because it has nothing to do after Recursive call
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
    */



    /*static void fun(int n, int k)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(k + " ");
        fun(n-1, k+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        fun(n, k);
    }
    */



    static int fun(int n, int k)
    {
        if(n==0 || n==1)
        {
            return k;
        }
        // k = k*n;
        // return fun(n-1, k);
        return fun(n-1, k*n);
        // Tail Recursive solution of factorial
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        System.out.println(fun(n, k));
    }
}
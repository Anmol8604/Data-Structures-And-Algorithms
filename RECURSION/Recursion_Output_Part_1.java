import java.util.Scanner;

public class Recursion_Output_Part_1 {
    /*
    // Example No.1
    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
    */



    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}

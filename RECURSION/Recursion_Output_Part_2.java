import java.util.Scanner;

public class Recursion_Output_Part_2 {

    /*
    // Example no. 1
    static int fun(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else 
        {
            return 1 + fun(n/2);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
    }
    */


    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        fun(n/2);
        System.out.print(n%2 + " ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}

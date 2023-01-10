import java.util.Scanner;

public class INTRO_RECURSION {
    // Function Calling Example
    /*
    static void fun1()
    {
        System.out.println("fun1");
    }
    static void fun2()
    {
        System.out.println("Before fun1");
        fun1();
        System.out.println("After fun1");
    }
    public static void main(String[] args)
    {
        System.out.println("Before fun2");
        fun2();
        System.out.println("After fun2");
    }
    */


    static void fun1(int n)
    {
        // Base case
        if(n==0)
        {
            return;
        }

        System.out.println("Anmol");
        
        fun1(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun1(n);
    }
}

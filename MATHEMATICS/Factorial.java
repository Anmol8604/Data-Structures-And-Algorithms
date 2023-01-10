import java.util.Scanner;

public class Factorial 
{
    static int factorialofN(int n)
    {
        int result = 1;
        for(int i = 2; i <= n; i++)
        {
            result = result*i;
        }
        return result;
        // TIme complextity = Theta(n)
    }

    static int factorial(int n)
    {
        if(n==0) return 1;
        return n*factorial(n-1);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Factorial of " + n + " is = ");
        System.out.print(factorial(n));
    }   
}

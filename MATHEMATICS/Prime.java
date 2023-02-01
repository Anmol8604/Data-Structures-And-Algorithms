import java.util.Scanner;

public class Prime {
    static boolean checkPrime(int n)
    {
        // Naive Method
        if(n == 1)
        {
            return false;
        }
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
        // Time Complexity = O(n)
    }

    static boolean isPrime(int n)
    {
        // Efficient Method
        if(n == 1)
        {
            return false;
        }
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
        // Time Complexity = O(Square root(n))
    }

    static boolean primeCheck(int n)
    {
        // More Efficient Method
        if(n == 1)
        {
            return false;
        }
        if(n == 2 || n == 3)
        {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }
        for(int i = 5; i*i < n; i=i+6)
        {
            if(n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(checkPrime(n));
        System.out.println(isPrime(n));
        // System.out.println(primeCheck(n));

    }
}

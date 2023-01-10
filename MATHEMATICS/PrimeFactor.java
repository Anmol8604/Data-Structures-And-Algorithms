import java.util.*;
public class PrimeFactor 
{
    static void primeFactor(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if(primeCheck(i))
            {
                int x = i;
                while(n % x == 0)
                {
                    System.out.print( i + " ");
                    x = x*i;
                }
            }
        }
        // Time Complexity = O(n^2 logn)
    }
    
    static boolean primeCheck(int n)
    {
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




    static void printPrimeFactor(int n)
    {
        // Efficient Method
        if(n < 2)
        {    
            return;
        }
        for(int i = 2; i * i <= n; i++)
        {
            while(n%i == 0)
            {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if(n > 1)
        {
            System.out.println(n);
        }
    }


    static void printprimeFactor(int n)
    {
        if(n < 2) 
        {
            return;     
        }
        while(n % 2 == 0)
        {
            System.out.print(2 + " ");
            n = n / 2;
        }
        while(n % 3 == 0)
        {
            System.out.print(3 + " ");
            n = n / 3;
        }
        for(int i = 5; i*i <= n; i = i +6)
        {
            while(n % i == 0)
            {
                System.out.print(i + " ");
                n = n / i;
            }
            while(n % (i + 2) == 0)
            {
                System.out.print(i+2 + " ");
                n = n / (i + 2);
            }
        }
        if (n > 3)
        {
            System.out.print(n);
        }
        // Time Complexity = Theta(Square root(n))
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // primeFactor(n);
        // printPrimeFactor(n);
        printprimeFactor(n);
    }    
}

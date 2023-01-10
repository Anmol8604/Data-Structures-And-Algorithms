import java.util.Scanner;

public class AllDivisor 
{
    static void allDivisor(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        // Theta (n)
    }

    static void allDivisorofN(int n)
    {
        for(int i = 1; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                if(i != (n/i))
                {
                System.out.print(n/i + " ");
                }
            }
        }
    }

    static void allDivisorofNumbern(int n)
    {
        int i;
        for(i = 1; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        for( ; i >= 1; i--)
        {
            System.out.print(n/i + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // allDivisor(n);
        // allDivisorofN(n);
        allDivisorofNumbern(n);
    }
}
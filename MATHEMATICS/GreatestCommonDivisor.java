import java.util.Scanner;

class GreatestCommonDivisor 
{
    static int gcd(int a, int b)
    {
        // Naive method
        int res = Math.min(a, b);
        while(res > 0)
        {
            if(a % res == 0 && b % res == 0)
            {
                break;
            }
            res--;
            // Time Complexity = O(min(a,b))
        }
        return res;
    }
    static int greatestCommonDivisor(int a, int b)
    {
        // Euclidean Algorithm
        while (a != b)
        {
            if(a > b)
            {
                a = a-b;
            }
            else 
            {
                b = b-a;
            }
        }
        return a;
    }

    static int optimisedEucliden(int a, int b)
    {
        // Optimised Euclidean Algorithm
        while (a != b)
        {
            if(b == 0)
            {
                return a;
            }
            else
            {
                return optimisedEucliden(b, a%b);
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(gcd(a, b));
        // System.out.println(greatestCommonDivisor(a, b));
        System.out.println(optimisedEucliden(a, b));
    }
}

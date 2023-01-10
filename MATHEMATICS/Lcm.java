import java.util.Scanner;
class Lcm {
    static int LeastCM(int a, int b)
    {
        // Naive Solution
        int res = Math.max(a, b);
        while(true)
        {
            if(res % a == 0 && res % b == 0)
            {
                return res;
            }
            res++;
        }
        // Time Complexity = O(a*b - (max(a,b)))
    }

    static int optimisedEucliden(int a, int b)
    {
        // Optimised Euclidean Algorithm
        if(b == 0)
        {
            return a;
        }       
        return optimisedEucliden(b, a%b);
    }


    static int LeastCommonDivisor(int a, int b)
    {
        return (a*b)/ optimisedEucliden(a, b);
    } 
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(LeastCM(a, b));
        System.out.println(LeastCommonDivisor(a, b));
    }    
}
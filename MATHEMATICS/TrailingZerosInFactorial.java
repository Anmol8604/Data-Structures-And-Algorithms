import java.util.Scanner;

public class TrailingZerosInFactorial 
{
    // Naive method
    static int countZeros(int n)
    {
        int factorial = 1;
        for(int i = 2; i <= n; i++)
        {
            factorial = factorial*i;
        }
        // return factorial;
        int count = 0; 
        while(factorial % 10 == 0){
            count++;
            factorial = factorial / 10;
        }
        return count;
        // Time Complexity = Theta(n)
    }

    // Efficient Method
    static int trailingZero(int n)
    {
        int res = 0;
        for(int i = 5; i <= n; i = i * 5)
        {
            res = res + n / i;
        }
        return res;
        // Time Complexity = Theta(logn)
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(countZeros(n));
        System.out.println(trailingZero(n));
    }
}
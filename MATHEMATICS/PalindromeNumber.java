import java.util.Scanner;
public class PalindromeNumber 
{
    static boolean palindromeNumber(int n)
    {
        int reverse = 0;
        int count = 0;
        int m = n;
        while (n != 0)
        {
            count = n % 10;
            reverse = reverse*10 + count;
            n = n / 10;
        }
        return m == reverse;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(palindromeNumber(n));
    }   
}

import java.util.Scanner;

public class Sum_Of_Digit {
    static int sumOfDigit(int n)
    {
        if(n<=9){
            return n;
        }
        return n%10 + sumOfDigit(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigit(n));
    }
}

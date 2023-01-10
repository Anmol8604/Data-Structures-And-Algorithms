import java.util.Scanner;

public class Power_Of_Two {

    static boolean method_1(int n)
    {
        if(n == 0)
        {
            return false;
        }
        while(n != 1){
            if(n%2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }

    static boolean method_2(int n)
    {
        if(n == 0)
        {
            return false;
        }
        return ((n&(n-1))==0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println(method_1(n));
        System.out.println(method_2(n));
    }
}

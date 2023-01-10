import java.util.Scanner;

public class ComputePower {
    static int naive1(int x, int n)
    {
        int res = 1;
        if(n <=1)
        {
            return x;
        }
        for(int i = 1; i <= n; i++)
        {
            res = res*x;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(naive1(x, n));
        System.out.println(RecursiveSolution(x, n));
    }
    static int RecursiveSolution(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int temp = RecursiveSolution(x, n/2);
        temp = temp * temp;
        if(n%2 == 0)
        {
            return temp;
        }
        else {
            return temp * x;
        }
    }
}

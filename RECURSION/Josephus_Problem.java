import java.util.Scanner;

public class Josephus_Problem {
    static int josephusOutput(int n, int k)
    {
        if(n==1)
        {
            return 0;
        }
        else 
        {
            return (josephusOutput(n-1, k)+k)%n;
        }
    }

    static int myjosephusOutput(int n, int k)
    {
        // if counting start from 1 instead of 0
        return josephusOutput(n, k) + 1;
    }
    public static void main(String[] java)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(josephusOutput(n, k));
    }
}
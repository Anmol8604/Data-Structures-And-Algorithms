import java.util.Scanner;

public class Kth_BIT {
    static boolean kth(int N , int k)
    {
        if ((N>>(k-1)&1) != 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(kth(N, k));
    }
}

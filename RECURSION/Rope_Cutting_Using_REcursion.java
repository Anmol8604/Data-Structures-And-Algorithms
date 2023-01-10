import java.util.Scanner;

public class Rope_Cutting_Using_REcursion {

    static int Rope_cutting(int N, int a, int b, int c)
    {
        if( N == 0)
        {
            return 0;
        }
        if( N < 0)
        {
            return -1;
        }
        int res = Math.max(Rope_cutting(N-a, a, b, c), Math.max(Rope_cutting(N-b, a, b, c), Rope_cutting(N-c, a, b, c)));
        if(res == -1)
        {
            return -1;
        }
        return res + 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Rope_cutting(N, a, b, c));
    }
}

import java.util.Scanner;

public class Sum_Of_Natural {
    static int sum_ofFirstN(int n, int k)
    {
        if(n == 0){
            return k;
            // return 0; // for or return
        }
        return sum_ofFirstN(n-1, k+n);
        // or
        // return n + sum_ofFirstN(n-1);
    }
    public static void main(String[] arsg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        System.out.println(sum_ofFirstN(n, k));
    }
}

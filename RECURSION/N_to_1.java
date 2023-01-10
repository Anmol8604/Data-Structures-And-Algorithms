import java.util.Scanner;

public class N_to_1 {
    static void fun(int n)
    {
        if(n==0){
            return;
        }
        System.out.print(n +" ");
        fun(n-1);


    }
    public static void main(String[] args)
    {
        Scanner dc = new Scanner(System.in);
        int n = dc.nextInt();
        fun(n);
    }
}

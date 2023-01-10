import java.util.Scanner;

public class BITWISE_LEFT_SHIFT {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Left_Shift(x, y));
    }
    static int Left_Shift(int x, int y)
    {
        return x<<y;
    }
}

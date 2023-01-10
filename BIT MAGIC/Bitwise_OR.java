import java.util.Scanner;

public class Bitwise_OR {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(OR(x, y));
    }
    static int OR(int x, int y)
    {
        return x | y;
    }
}

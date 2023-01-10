import java.util.Scanner;

public class BITWISE_NOT {
    static int NOT(int x)
    {
        return ~x;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(NOT(x));
    }
}

import java.util.*;

public class Bitwise_XOR {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(XOR(x, y));
    }
    static int XOR(int x, int y)
    {
        return x ^ y;
    }
}

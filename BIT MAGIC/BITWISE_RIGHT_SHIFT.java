import java.util.Scanner;

public class BITWISE_RIGHT_SHIFT {
    public static void main(String[] arsg)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
    }
    static int UNSIGNED_RIGHT_Shift(int x, int y)
    {
        // IN unsigned right shift we use 3 right shift opertor instead of 2
        // for postive number it doesn't make any diff , for postive numbers it behaves like simple right shift operator.
        return x>>>y;
    }

    static int RIGHT_Shift(int x, int y)
    {
        // it behaves differnt for negative, in case of negative number the leading bits are filled by one to keep the sign
        // and for , positve number leading bit is filled by 0
        return x>>y;
    }
}

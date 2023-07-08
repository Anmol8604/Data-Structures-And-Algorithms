import Linked_List.Node;

import java.util.Scanner;

public class Bitwise_AND {
    public static void main(String[] args)
    {
        Scanner cs = new Scanner(System.in);
        int x = cs.nextInt();
        int y = cs.nextInt();
        System.out.println(AND(x, y));
    }
    static int AND(int x , int y)
    {
        return x&y;
    }
}

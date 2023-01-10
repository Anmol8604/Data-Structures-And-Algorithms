import java.util.Scanner;

public class Tower_Of_Hanoi {
    static void tower_Of_Hanoi(int N, char A, char B, char C)
    {
        if(N==1)
        {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        tower_Of_Hanoi(N-1, A, C, B);
        System.out.println("Move " + N + " from " + A + " to " + C);
        tower_Of_Hanoi(N-1, B, A, C);
    }
    public static void main(String[] java)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        tower_Of_Hanoi(N, 'A', 'B', 'C');
    }
}

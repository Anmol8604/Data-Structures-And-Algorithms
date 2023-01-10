import java.util.Scanner;

public class Power_Set {

    static void PRint_powerSet(String str)
    {
        int n = str.length();
        int powerSize = (int) Math.pow(2, n);
        for(int counter = 0; counter < powerSize; counter++)
        {
            for(int j = 0; j < n; j++)
            {
                if((counter & (1<<j)) != 0)
                {
                    System.out.print(str.charAt(j));
                    // System.out.print(" (" + counter);
                    // System.out.print("," + j + ")");
                }
            }
            System.out.print(" ");
        }

    }
    /*
     * if counter = 1, j = 0;
     * A
     * if counter = 2, j = 1;
     * B
     * if counter = 3, j = 0; counter = 3, j = 1;
     * AB
     * if counter = 4, j = 2;
     * C
     */
    public static void main(String[] arsg)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        PRint_powerSet(str);
    }
}

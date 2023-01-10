import java.util.Scanner;

public class Generate_Subsets {
    static void generateSubSet(String str, String cur, int i)
    {
        if(i == str.length())
        {
            System.out.println(cur);
            return;
        }
        generateSubSet(str, cur, i+1);
        generateSubSet(str, cur+str.charAt(i), i+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String cur = "";
        int i = 0;
        generateSubSet(str, cur, i);
    }
}

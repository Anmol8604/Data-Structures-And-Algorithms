import java.util.Scanner;

public class Palindrome_Check {
    static boolean palinDrome(String str, int start,int end)
    {
        if(start >= end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end)) && palinDrome(str, start + 1, end - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int start = 0;
        int end = n -1;
        System.out.println(palinDrome(str, start, end));
    }   
}

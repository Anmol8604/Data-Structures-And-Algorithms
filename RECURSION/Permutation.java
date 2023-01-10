import java.util.Scanner;

public class Permutation {
    /*
    static void printingPermutations(String str, int n, int i)
    {
        for(int j = i; j < str.length(); j++)
        {
            swap(str[i], str[j]);
        }

    }
    public static void main(String[] java)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        printingPermutations(str, n);
    }
    */
    public static void main(String[] args) 
    { 
        String str = "ABC"; 
        int r = str.length(); 
        Permutation permutation = new Permutation(); 
        permutation.permute(str, 0, r-1); 
    } 
  
    /** 
    * permutation function 
    * @param str string to calculate permutation for 
    * @param l starting index 
    * @param r end index 
    */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}

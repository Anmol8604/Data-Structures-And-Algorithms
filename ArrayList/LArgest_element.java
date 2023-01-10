package ArrayList;

import java.util.Scanner;

public class LArgest_element {

    static int largeElement(int array[], int n)
    {
        int res = 0;
        for(int i = 1; i < n; i++){
            if(array[i] > array[res])
            {
                res = i;
            }
        }
        return array[res];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of an array
        int array[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        } 
        System.out.println(largeElement(array, n));
    }
}

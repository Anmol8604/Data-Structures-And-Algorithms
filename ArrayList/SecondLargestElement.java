package ArrayList;
import java.util.*;

public class SecondLargestElement{
    public static void main(String[] args) {
        int [] array = {20, 80, 78};
        
        System.out.println(sec(array));
        System.out.println(Secondlargest(array));
        // System.out.println(secLargest(array));
    }

    static int Secondlargest(int array[])
    {
        int n = array.length;
        int max = 0;
        int max2 = -1; 
        
        for(int i = 1; i < n; i++)
        {
            if(array[i] > array[max])
            {
                max2 = max;
                max = i;
            }
            else if(array[i] != array[max])
            {
                if(max2 == -1 || array[i] > array[max2])
                {
                    max2 = i;
                }
            }
        }
        return array[max2];
    }


    /*
    static int secLargest(int array[])
    {
        int n = array.length;
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            if(array[i] > array[max])
            {
                max = i;
            }
        }

        int max2 = -1;
        for(int i = 0; i < n; i++)
        {
            if(array[i] != array[max])
            {
                if(max2 == -1)
                {
                    max2 = i;
                }

                if(array[i] > array[max2])
                {
                    max2 = i;
                }
            }
        }
        return max2;
    }
    */

    public static int sec(int array[])
    {
        int n = array.length;
        int max = 0;
        int secmax = -1;

        for(int i = 1; i < n; i++)
        {
            if(array[i] > array[max])
            {
                secmax = max;
                max = i;
            }
            else {
                if(array[secmax]==-1 || array[i] > array[secmax])
                {
                    secmax = i;
                }
            }
        }
        return array[secmax];
    }
}
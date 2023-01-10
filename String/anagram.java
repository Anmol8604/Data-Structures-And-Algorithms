package String;

import java.util.*;
public class anagram {
    public static void main(String args[]) {
      String a = "HELLO";
      String b = "hello";
      a = a.toLowerCase();
      b = b.toLowerCase();
      String []arr = a.split("");
      String []brr = b.split("");
      Arrays.sort(arr);
      Arrays.sort(brr);
      for(int i = 0; i < arr.length; i++)
      {
          System.out.println(arr[i]);
      }
      System.out.println();
      for(int i = 0; i < brr.length; i++)
      {
          System.out.println(brr[i]);
      }

      System.out.println();
      
      boolean flag = true;
    //   if(arr.length == brr.length)
    //     {
    //         flag = false;
    //    }
      for(int i = 0; i<arr.length; i++)
        {
            if(arr[i].equals(brr[i]))
            {
                flag =  true;
            }
            else{
                flag = false;
                break;
            }
        }
       System.out.println(flag);
    }
}
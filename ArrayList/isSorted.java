package ArrayList;

public class isSorted {
    public static void main(String args[]) {
        int x[] = {10, 20, 30, 40};
  
        System.out.println(sorted(x));
      }
      
      static boolean sorted(int x[])
      {
          int n = x.length;
          for(int i = 0; i < n-1; i++)
          {
              if(x[i+1] < x[i])
              {
                  return false;
              }
          }
          return true;
      }
}

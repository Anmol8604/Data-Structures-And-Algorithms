package Matrix;

/*
 *  Given Matrix 
 *        1      2      3      4
 *                             
 *        5      6      7      8
 *        
 *        9      10     11     12
 *                             
 *        13     14     15     16
 * 
 * Task / Output:
 *        4      8      12      16
 *                             
 *        3      7      11      15
 *        
 *        2      6      10      14
 *                              
 *        1      5      9       13
 */

public class RotateMatrix {
     public static void main(String[] args) {
          int[][] arr = {{1, 2, 3, 4}, 
                         {5, 6, 7, 8}, 
                         {9, 10, 11, 12}, 
                         {13, 14, 15, 16}};
          System.out.println("Matrix before Rotaion:");
          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + "  "); 
               }
               System.out.println();
          }

          arr = rotate90(arr); // Time(theta(n^2)) , space(theta(1))
          System.out.println();

          System.out.println("Matrix After Rotating Anti-clockwise:");
          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + "  "); 
               }
               System.out.println();
          }

          // arr = rotaion(arr); // Time(theta(n^2)) , space(theta(n^2))
          // System.out.println();

          // System.out.println("Matrix After Rotating Anti-clockwise:");
          // for(int i = 0; i < arr.length; i++) {
          //      for(int j = 0; j < arr.length; j++) {
          //           System.out.print(arr[i][j] + "  "); 
          //      }
          //      System.out.println();
          // }

          
     }

     static int[][] rotate90(int[][] arr) {
          for(int i = 0; i < arr.length; i++) {
               for(int j = i+1; j < arr.length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
               }
          }
          for(int i = 0; i < arr.length; i++) {
               int low = 0;
               int high = arr.length-1;
               while(low < high) {
                    int temp = arr[low][i];
                    arr[low][i] = arr[high][i];
                    arr[high][i] = temp;
                    low++; 
                    high--;
               }
          }
          return arr;
     }

     static int[][] rotaion(int[][] arr) {
          int ans[][] = new int[arr.length][arr.length];
          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length; j++) {
                    ans[i][j] = arr[i][j];
               }
          }
          int m = 0, n = 0;
          for(int i = arr.length-1; i >= 0; i--) {
               n = 0;
               for(int j = 0; j < arr.length; j++) { 
                    arr[m][n++] = ans[j][i];
               }
               m++;
          }
          return arr;
     }
     
}

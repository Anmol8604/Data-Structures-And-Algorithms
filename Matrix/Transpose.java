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
 *        1      5      9       13
 *                             
 *        2      6      10      14
 *        
 *        3      7      11      15
 *                              
 *        4      8      12      16
 */

public class Transpose {
     public static void main(String[] args) {
          int[][] arr = {{1, 2, 3, 4}, 
                         {5, 6, 7, 8}, 
                         {9, 10, 11, 12}, 
                         {13, 14, 15, 16}};
          System.out.println("Matrix before transpose:");
          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + "  "); 
               }
               System.out.println();
          }

          arr = transpose_matrix(arr);
          System.out.println();

          System.out.println("Matrix After transpose:");
          for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + "  "); 
               }
               System.out.println();
          }

          
     }

     public static int[][] transpose_matrix(int[][] arr) {
          for(int i = 0; i < arr.length; i++) {
               for(int j = i+1; j < arr.length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp; 
               }
          }
          return arr;
     }
}

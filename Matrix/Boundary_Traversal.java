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
 * Task
 *        1  ->  2  ->  3  ->  4
 *                             |
 *        5                    8
 *        |                    |
 *        9                    12
 *        |                    |
 *        13 <-  14 <-  15 <-  16
 * 
 * Output : 1 2 3 4 8 12 16 15 14 13 9 5
 */

public class Boundary_Traversal {
     public static void main(String[] args) {
          int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
          
          traversal(arr);
     }

     static void traversal(int[][] arr) {
          int r = arr.length; // number of rows
          int c = arr[0].length; // number of columns
          
          if(r == 1) {
               for(int i = 0; i < c; i++) {
                    System.out.print(arr[0][i] + " ");
               }
          }
          else if(c == 1) {
               for(int i = 0; i < r; i++) {
                    System.out.print(arr[i][0] + " ");
               }
          }
          else {
               for(int i = 0; i < c; i++) {
                    System.out.print(arr[0][i] + " ");
               }
               for(int i = 1; i < r; i++) {
                    System.out.print(arr[i][c-1] + " ");
               }
               for(int i = c-2; i >= 0; i--) {
                    System.out.print(arr[r-1][i] + " ");
               }
               for(int i = r-2; i > 0; i--) {
                    System.out.print(arr[i][0] + " ");
               }
          }
     }
}

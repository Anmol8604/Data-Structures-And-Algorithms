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
 *        5  <-  6  <-  7  <-  8
 *        |
 *        9  ->  10 ->  11 ->  12
 *                             |
 *        13 <-  14 <-  15 <-  16
 * 
 * Output : 1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13
 */
public class Snake_pattern {
     public static void main(String[] args) {
          int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
          
          snake(arr);
     }

     static void snake(int[][] arr) {
          int r = arr.length; // Number of rows
          int c = arr[0].length; // Number of columns
          for(int i = 0; i < r; i++) {
               if(i%2==0) { // for Printing left to right.
                    for(int j = 0; j < c; j++) {
                         System.out.print(arr[i][j] + " ");
                    }
               }
               else { // for printing right to left
                    for(int j = c-1; j >= 0; j--) {
                         System.out.print(arr[i][j] + " ");
                    }
               }
          }
     }
}

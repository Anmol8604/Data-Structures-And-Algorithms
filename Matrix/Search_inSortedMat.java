package Matrix;

/*
 *   Given Matrix 
 *        10     20     30     40
 *                             
 *        15     25     35     45
 *        
 *        27     29     37     48
 *                             
 *        32     39     46     50
 * 
 *   Task :    Search < 33 >
 *   Output:   Found At ()
 */

public class Search_inSortedMat {
     public static void main(String[] args) {
          int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 39, 46, 50}};
          int x = 32;
          int r = matrix.length;
          int c = matrix[0].length;

          System.out.println(search(matrix, x, r, c));
     }

     static String search(int[][] matrix, int x, int r, int c) {
          int i = 0;
          int j = c-1;
          while(i < r && j >= 0) {
               if(matrix[i][j] == x) {
                    return "Found at (" + (i+1) + ", " + (j+1) + ")";
               }
               else if (matrix[i][j] > x) {
                    j--;
               }
               else {
                    i++;
               }
          }
          return "Not Found";
     }
}

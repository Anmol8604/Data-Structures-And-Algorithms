package Matrix;

public class TraversingIn2D {
     public static void main(String[] args) {
          int[][] arr = {{1, 2, 0, 4, 5}, {6, 7, 8, 9}};
          traversing(arr);
     }

     static void traversing(int[][]arr) {
          int n = arr.length;
          for(int i = 0; i < n; i++) {
               for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
               }
               System.out.println(); // For printing a array in tabular form.
          }
     }
}

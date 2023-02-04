package Matrix;

import java.util.ArrayList;
import java.util.List;

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
 *        5  ->  6  ->  7      8
 *        |             |      |
 *        9      10 <-  11     12
 *        |                    |
 *        13 <-  14 <-  15 <-  16
 * 
 * Output : 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

public class SpiralMatrix {
     public static void main(String[] args) {
          int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
          List<Integer> list = new ArrayList<>();
          list = spiral(arr, list);

          System.out.println(list);
     }

     static List<Integer> spiral(int[][] arr, List<Integer> list) {
          int top = 0;
          int right = arr[0].length-1;
          int bottom = arr.length-1;
          int left = 0;
          while(top <= bottom && left <= right) {
               for(int i = left; i <= right; i++) {
                    list.add(arr[top][i]);
               }
               top++;
               for(int i = top; i <= bottom; i++) {
                    list.add(arr[i][right]);
               }
               right--;
               if(top <= bottom) {
                    for(int i = right; i >= left; i--) {
                         list.add(arr[bottom][i]);
                    }
                    bottom--;
               }
               if(right >= left) {
                    for(int i = bottom; i >= top; i--) {
                         list.add(arr[i][left]);
                    }
                    left++;
               }
          }
          return list;
     }
}
